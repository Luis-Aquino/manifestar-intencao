package br.universidade.manifestarintencao.controller;

import br.universidade.manifestarintencao.entity.Turma;
import br.universidade.manifestarintencao.repository.TurmaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    private final TurmaRepository repo;

    public TurmaController(TurmaRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Turma salvar(@RequestBody Turma t) {
        return repo.save(t);
    }

    @GetMapping
    public List<Turma> listar() {
        return repo.findAll();
    }
}
