package com.mecanica.services;

import com.mecanica.models.Servico;
import com.mecanica.repositories.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ServicoService {

    private final ServicoRepository servicoRepository;

    @Autowired
    public ServicoService(ServicoRepository servicoRepository) {
        this.servicoRepository = servicoRepository;
    }

    public List<Servico> getAllServico(){
        return servicoRepository.findAll();
    }

    public Optional<Servico> findByIdServico (Long id){
        return servicoRepository.findById(id);
    }

    public Servico createServico (Servico servico){
        return servicoRepository.save(servico);
    }

    public Servico updateServico (Servico servico){
        return servicoRepository.save(servico);
    }

    public void deleteServico (Long id){
        servicoRepository.deleteById(id);
    }


}
