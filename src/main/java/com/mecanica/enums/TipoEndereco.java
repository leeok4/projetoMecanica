package com.mecanica.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TipoEndereco {

    CASA("Minha casa"),
    RESIDENCIAL("Residencia"),
    TRABALHO("Trabalho");

    private final String nome;

    TipoEndereco(String nome) {
        this.nome = nome;
    }

    @JsonValue
    public String getValue() {
        return this.name();
    }

    @JsonCreator
    public static TipoEndereco fromValue(String value) {
        for (TipoEndereco tipo : values()) {
            if (tipo.name().equalsIgnoreCase(value)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Tipo de endereço desconhecido: " + value);
    }
}
