package com.mecanica.controllers;

import com.mecanica.models.ClienteModel;
import com.mecanica.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/")
    public String getAllClientes(){
        return "API FUNCIONANDO BY DIEGUITOLABAR";
    }
}
