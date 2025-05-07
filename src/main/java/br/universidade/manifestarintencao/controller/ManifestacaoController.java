package br.universidade.manifestarintencao.controller;

import br.universidade.manifestarintencao.entity.ManifestacaoInteresse;
import br.universidade.manifestarintencao.service.ManifestacaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manifestacoes")
public class ManifestacaoController {

    private final ManifestacaoService service;

    public ManifestacaoController(ManifestacaoService service) {
        this.service = service;
    }

    @PostMapping
    public ManifestacaoInteresse manifestar(@RequestBody ManifestacaoInteresse m) {
        return service.salvar(m);
    }

    @GetMapping
    public List<ManifestacaoInteresse> listar() {
        return service.listarTudo();
    }
}
