package br.universidade.manifestarintencao.controller;

import br.universidade.manifestarintencao.entity.Docente;
import br.universidade.manifestarintencao.entity.Turma;
import br.universidade.manifestarintencao.entity.ManifestacaoInteresse;
import br.universidade.manifestarintencao.repository.DocenteRepository;
import br.universidade.manifestarintencao.repository.TurmaRepository;
import br.universidade.manifestarintencao.repository.ManifestacaoInteresseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/manifestacoes")
public class ManifestacaoController {

    private final ManifestacaoInteresseRepository manifestacaoRepo;
    private final DocenteRepository docenteRepo;
    private final TurmaRepository turmaRepo;

    public ManifestacaoController(ManifestacaoInteresseRepository manifestacaoRepo,
                                  DocenteRepository docenteRepo,
                                  TurmaRepository turmaRepo) {
        this.manifestacaoRepo = manifestacaoRepo;
        this.docenteRepo = docenteRepo;
        this.turmaRepo = turmaRepo;
    }

    @PostMapping
    public ManifestacaoInteresse manifestar(@RequestBody ManifestacaoInteresse m) {
        if (m.getDocente() != null && m.getDocente().getId() != null) {
            Optional<Docente> docente = docenteRepo.findById(m.getDocente().getId());
            docente.ifPresent(m::setDocente);
        }

        if (m.getTurma() != null && m.getTurma().getId() != null) {
            Optional<Turma> turma = turmaRepo.findById(m.getTurma().getId());
            turma.ifPresent(m::setTurma);
        }

        return manifestacaoRepo.save(m);
    }

    @GetMapping
    public List<ManifestacaoInteresse> listar() {
        return manifestacaoRepo.findAll();
    }
}
