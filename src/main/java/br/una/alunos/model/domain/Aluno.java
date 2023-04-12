package br.una.alunos.model.domain;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name = "tb_aluno")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Aluno implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomeAluno")
    private String nome;

    @Column(name = "matriculaAluno")
    private Integer matricula;

//    public Aluno()
//    {
//
//    }
//
//    public Aluno(Long id, String nome, Integer matricula)
//    {
//        this.id = id;
//        this.nome = nome;
//        this.matricula = matricula;
//    }
//
//    public Aluno(String nome)
//    {
//        this.nome = nome;
//    }
//
//    public Long getId()
//    {
//        return id;
//    }
//
//    public void setId(Long id)
//    {
//        this.id = id;
//    }
//
//    public String getNome()
//    {
//        return nome;
//    }
//
//    public void setNome(String nome)
//    {
//        this.nome = nome;
//    }
//
//    public Integer getMatricula()
//    {
//        return matricula;
//    }
//
//    @Override
//    public String toString() {
//        return "Aluno{" +
//                "id=" + id +
//                ", nome='" + nome + '\'' +
//                ", matricula=" + matricula +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o)
//    {
//        if (this == o) return true;
//        if (!(o instanceof Aluno aluno)) return false;
//        return getId().equals(aluno.getId()) && getNome().equals(aluno.getNome()) && getMatricula().equals(aluno.getMatricula());
//    }
//
//    @Override
//    public int hashCode()
//    {
//        return Objects.hash(getId(), getNome(), getMatricula());
//    }
}
