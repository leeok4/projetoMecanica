package com.mecanica.enums;

public enum TipoEndereco {

    CASA("Minha casa"),
    RESIDENCIAL("Residencia"),
    TRABALHO("Trabalho");

    final String nome;

    TipoEndereco(String nome) {
        this.nome = nome;
    }

    public String getKey() {
        return this.name();
    }

    public String getNome() {
        return nome;
    }

}
