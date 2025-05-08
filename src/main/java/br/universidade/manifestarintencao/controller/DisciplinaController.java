package br.universidade.manifestarintencao.controller;

import br.universidade.manifestarintencao.entity.Disciplina;
import br.universidade.manifestarintencao.repository.DisciplinaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

    private final DisciplinaRepository disciplinaRepository;

    public DisciplinaController(DisciplinaRepository disciplinaRepository) {
        this.disciplinaRepository = disciplinaRepository;
    }

    @PostMapping
    public Disciplina salvar(@RequestBody Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    @GetMapping
    public List<Disciplina> listar() {
        return disciplinaRepository.findAll();
    }
}
