package br.universidade.manifestarintencao.controller;

import br.universidade.manifestarintencao.entity.Docente;
import br.universidade.manifestarintencao.repository.DocenteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docentes")
public class DocenteController {

    private final DocenteRepository repo;

    public DocenteController(DocenteRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Docente salvar(@RequestBody Docente d) {
        return repo.save(d);
    }

    @GetMapping
    public List<Docente> listar() {
        return repo.findAll();
    }
}
