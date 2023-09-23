package com.mecanica.services;

import com.mecanica.models.Veiculo;
import com.mecanica.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    private final VeiculoRepository veiculoRepository;

    @Autowired
    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public List<Veiculo> getAll() {
        return veiculoRepository.findAll();
    }

    public Veiculo cadastrarVeiculo(Veiculo veiculoModel) {
        return veiculoRepository.save(veiculoModel);
    }

    public void deletarVeiculo(Long id) {
        veiculoRepository.deleteById(id);
    }
}
