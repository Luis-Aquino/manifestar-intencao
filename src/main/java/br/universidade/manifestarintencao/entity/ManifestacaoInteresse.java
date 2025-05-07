package br.universidade.manifestarintencao.entity;

import jakarta.persistence.*;

@Entity
public class ManifestacaoInteresse {
    @EmbeddedId
    private ManifestacaoId id;

    @ManyToOne
    @MapsId("docenteId")
    private Docente docente;

    @ManyToOne
    @MapsId("turmaId")
    private Turma turma;

    @Enumerated(EnumType.STRING)
    private StatusManifestacao status = StatusManifestacao.PENDENTE;

    public ManifestacaoId getId() {
        return id;
    }

    public void setId(ManifestacaoId id) {
        this.id = id;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public StatusManifestacao getStatus() {
        return status;
    }

    public void setStatus(StatusManifestacao status) {
        this.status = status;
    }
}
