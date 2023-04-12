package br.una.alunos.model.dao;

import br.una.alunos.model.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AlunoDao extends JpaRepository<Aluno, Long>
{
//    List alunoList = new ArrayList<>();
//
//    public void inserir(Aluno aluno)
//    {
//        alunoList.add(aluno);
//
//    }
//
//    public void alterar(Aluno aluno)
//    {
//        alunoList.add(aluno);
//    }
//
//    public void delete(Aluno aluno)
//    {
//        alunoList.remove(aluno);
//    }
//
//    public List<Aluno> listAluno()
//    {
//        return alunoList;
//    }
}
