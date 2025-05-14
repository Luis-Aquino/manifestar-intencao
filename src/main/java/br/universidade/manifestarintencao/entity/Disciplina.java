package br.universidade.manifestarintencao.disciplina;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int cargaHoraria;

    @ManyToOne
    private Nucleo nucleo;

    @OneToMany(mappedBy = "disciplina")
    private List<Turma> turmas;

    public Disciplina() {}

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Nucleo getNucleo() {
        return nucleo;
    }

    public void setNucleo(Nucleo nucleo) {
        this.nucleo = nucleo;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
}
