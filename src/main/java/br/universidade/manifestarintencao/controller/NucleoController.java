package br.universidade.manifestarintencao.controller;

import br.universidade.manifestarintencao.entity.Nucleo;
import br.universidade.manifestarintencao.repository.NucleoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nucleos")
public class NucleoController {

    private final NucleoRepository repo;

    public NucleoController(NucleoRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Nucleo salvar(@RequestBody Nucleo n) {
        return repo.save(n);
    }

    @GetMapping
    public List<Nucleo> listar() {
        return repo.findAll();
    }
}
