package br.universidade.manifestarintencao.entity;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ManifestacaoId implements Serializable {
    private Long docenteId;
    private Long turmaId;

    public ManifestacaoId() {}

    public ManifestacaoId(Long docenteId, Long turmaId) {
        this.docenteId = docenteId;
        this.turmaId = turmaId;
    }

    public Long getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(Long docenteId) {
        this.docenteId = docenteId;
    }

    public Long getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(Long turmaId) {
        this.turmaId = turmaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ManifestacaoId that)) return false;
        return Objects.equals(docenteId, that.docenteId) && Objects.equals(turmaId, that.turmaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(docenteId, turmaId);
    }
}
