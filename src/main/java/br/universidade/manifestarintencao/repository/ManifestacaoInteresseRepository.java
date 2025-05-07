package br.universidade.manifestarintencao.repository;

import br.universidade.manifestarintencao.entity.ManifestacaoId;
import br.universidade.manifestarintencao.entity.ManifestacaoInteresse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManifestacaoInteresseRepository extends JpaRepository<ManifestacaoInteresse, ManifestacaoId> {
}
