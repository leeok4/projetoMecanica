package com.mecanica.services;

import com.mecanica.models.Cliente;
import com.mecanica.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }
    public Cliente cadastrarCliente(Cliente clienteModel) {
        Cliente novoCliente = clienteRepository.save(clienteModel);

        return novoCliente;
    }
}
