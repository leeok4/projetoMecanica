package com.mecanica.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Boolean isRecorrente;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private Double Valor;
    private String tempoExecucao;
    @Column(nullable = false)
    private String observacao;

    public Servico() {
    }

    public Servico(Long id, String nome, Boolean isRecorrente, String descricao, Double valor, String tempoExecucao, String observacao) {
        this.id = id;
        this.nome = nome;
        this.isRecorrente = isRecorrente;
        this.descricao = descricao;
        Valor = valor;
        this.tempoExecucao = tempoExecucao;
        this.observacao = observacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getIsRecorrente() {
        return isRecorrente;
    }

    public void setIsRecorrente(Boolean recorrente) {
        isRecorrente = recorrente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double valor) {
        Valor = valor;
    }

    public String getTempoExecucao() {
        return tempoExecucao;
    }

    public void setTempoExecucao(String tempoExecucao) {
        this.tempoExecucao = tempoExecucao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}