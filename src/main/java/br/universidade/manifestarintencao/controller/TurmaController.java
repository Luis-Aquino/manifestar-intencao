package br.universidade.manifestarintencao.controller;

import br.universidade.manifestarintencao.entity.Disciplina;
import br.universidade.manifestarintencao.entity.Turma;
import br.universidade.manifestarintencao.repository.DisciplinaRepository;
import br.universidade.manifestarintencao.repository.TurmaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    private final TurmaRepository turmaRepository;
    private final DisciplinaRepository disciplinaRepository;

    public TurmaController(TurmaRepository turmaRepository, DisciplinaRepository disciplinaRepository) {
        this.turmaRepository = turmaRepository;
        this.disciplinaRepository = disciplinaRepository;
    }

    @PostMapping
    public Turma salvar(@RequestBody Turma turma) {
        // Confirma que a disciplina existe antes de salvar a turma
        if (turma.getDisciplina() != null && turma.getDisciplina().getId() != null) {
            Optional<Disciplina> disciplina = disciplinaRepository.findById(turma.getDisciplina().getId());
            disciplina.ifPresent(turma::setDisciplina);
        }

        return turmaRepository.save(turma);
    }

    @GetMapping
    public List<Turma> listar() {
        return turmaRepository.findAll();
    }
}
