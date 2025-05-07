package br.universidade.manifestarintencao.service;

import br.universidade.manifestarintencao.entity.ManifestacaoInteresse;
import br.universidade.manifestarintencao.repository.ManifestacaoInteresseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManifestacaoService {
    private final ManifestacaoInteresseRepository repo;

    public ManifestacaoService(ManifestacaoInteresseRepository repo) {
        this.repo = repo;
    }

    public ManifestacaoInteresse salvar(ManifestacaoInteresse m) {
        return repo.save(m);
    }

    public List<ManifestacaoInteresse> listarTudo() {
        return repo.findAll();
    }
}
