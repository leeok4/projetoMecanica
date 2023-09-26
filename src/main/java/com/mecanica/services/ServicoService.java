package com.mecanica.services;

import com.mecanica.models.Servico;
import com.mecanica.repositories.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

    private final ServicoRepository servicoRepository;

    @Autowired
    public ServicoService(ServicoRepository servicoRepository) {
        this.servicoRepository = servicoRepository;
    }

    public List<Servico> getAll(){
        return servicoRepository.findAll();
    }

    public Servico findById (Servico servico){
        return servicoRepository.findById(servico.getId()).get();
    }

    public Servico create (Servico servico){
        return servicoRepository.save(servico);
    }

    public Servico update (Servico servico){
        return servicoRepository.save(servico);
    }

    public void delete (Long id){
        servicoRepository.deleteById(id);
    }
}
