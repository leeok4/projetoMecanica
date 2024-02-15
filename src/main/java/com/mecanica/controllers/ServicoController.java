package com.mecanica.controllers;

import com.mecanica.models.Servico;
import com.mecanica.services.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/servicos")
public class ServicoController {

    private final ServicoService servicoService;

    @Autowired
    public ServicoController(ServicoService servicoService) {
        this.servicoService = servicoService;
    }

    @GetMapping("/")
    public List<Servico> getAllServico (){
        return servicoService.getAllServico();
    }

    @GetMapping("/{id}")
    public Optional<Servico> findByIdServico (@PathVariable Long id){
        return servicoService.findByIdServico(id);
    }

    @PostMapping("/")
    public Servico createServico (@RequestBody Servico servico){
        return servicoService.createServico(servico);
    }

    @PutMapping("/")
    public Servico updateServico (@RequestBody Servico servico){
        return servicoService.updateServico(servico);
    }

    @DeleteMapping("/{id}")
    public void deleteServico (@PathVariable Long id){
        servicoService.deleteServico(id);
    }
}
