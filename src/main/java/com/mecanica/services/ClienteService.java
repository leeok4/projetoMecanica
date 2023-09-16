package com.mecanica.services;

import com.mecanica.models.Cliente;
import com.mecanica.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Cliente> getAll() {
        List<Cliente> clienteList = clienteRepository.findAll();

        return clienteList;
    }
}
