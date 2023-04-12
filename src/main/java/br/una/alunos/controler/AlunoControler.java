package br.una.alunos.controler;

import br.una.alunos.model.domain.Aluno;
import br.una.alunos.model.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoControler
{
    @Autowired
    AlunoService alunoService;

    @PostMapping
    public ResponseEntity<?> inserir(@RequestBody Aluno aluno)
    {

        alunoService.inserir(aluno);
        return ResponseEntity.ok().build();
        //return ResponseEntity.created(uri).body("Aluno cadastrado");
    }


    @PostMapping("/{id}")
    public ResponseEntity<?> alterar(@PathVariable Long id, @RequestBody Aluno aluno)
    {
        alunoService.alterar(id, aluno);
        //alunoService.alterar(aluno);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(Long id)
    {
        alunoService.delete(id);
        //alunoService.delete(aluno);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Aluno>> listAluno()
    {
        List<Aluno> alunoList = alunoService.listAluno();

        return ResponseEntity.ok(alunoList);
    }
}
