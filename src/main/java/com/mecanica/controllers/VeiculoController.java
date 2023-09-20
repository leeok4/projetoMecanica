package com.mecanica.controllers;

import com.mecanica.models.Veiculo;
import com.mecanica.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    private final VeiculoService veiculoService;

    @Autowired
    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Veiculo> getAllVeiculos() {
        return veiculoService.getAll();
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Veiculo createVeiculo(@RequestBody Veiculo veiculoModel) {
        return  veiculoService.cadastrarVeiculo(veiculoModel);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteVeiculo(@PathVariable("id") Long id) {
        veiculoService.deletarVeiculo(id);
    }
}
