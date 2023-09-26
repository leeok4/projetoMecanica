package com.mecanica.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @ManyToOne
    @JoinColumn(name = "clienteId")
    private Cliente cliente;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "veiculoId", nullable = false)
    private Veiculo veiculo;
    private Boolean isRecorrente;
    private String descricao;
    private Double Valor;
    private Date dataInicial;
    private Date tempoExecucao;
    private String observacao;

    public Servico() {
    }

    public Servico(Long id, String nome, Cliente cliente, Veiculo veiculo, Boolean isRecorrente, String descricao, Double valor, Date tempoExecucao, String observacao) {
        this.id = id;
        this.nome = nome;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.isRecorrente = isRecorrente;
        this.descricao = descricao;
        Valor = valor;
        this.dataInicial = new Date();
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Boolean getisRecorrente() {
        return isRecorrente;
    }

    public void setisRecorrente(Boolean isRecorrente) {
        this.isRecorrente = isRecorrente;
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

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getTempoExecucao() {
        return tempoExecucao;
    }

    public void setTempoExecucao(Date tempoExecucao) {
        this.tempoExecucao = tempoExecucao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
