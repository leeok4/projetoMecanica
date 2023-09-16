package com.mecanica.controllers;

import com.mecanica.models.Cliente;
import com.mecanica.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/")
    public String getAllClientes(){
        return "API FUNCIONANDO BY DIEGUITOLABAR";
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente createCliente(@RequestBody Cliente clienteModel){
        return clienteService.cadastrarCliente(clienteModel);
    }

}
