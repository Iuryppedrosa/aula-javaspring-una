package br.una.alunos.model.service;

import br.una.alunos.model.dao.AlunoDao;
import br.una.alunos.model.domain.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AlunoService
{
    //AlunoDao alunoDao = new AlunoDao();
    @Autowired
    AlunoDao alunoDao;

    public AlunoService(AlunoDao alunoDao){
        this.alunoDao = alunoDao;
    }

    public void inserir(Aluno aluno)
    {
        if(!aluno.getMatricula().equals("123"))
        {
            alunoDao.save(aluno);
            //alunoDao.inserir(aluno);
        }
    }

    public void alterar(Long id, Aluno aluno)
    {
        aluno.setId(id);
        alunoDao.save(aluno);
        //alunoDao.alterar(aluno);
    }

    public void delete(Long id)
    {
        //alunoDao.delete(aluno);
        alunoDao.deleteById(id);
    }

    public List<Aluno> listAluno()
    {
        return alunoDao.findAll();
        //return alunoDao.listAluno();
    }
}
