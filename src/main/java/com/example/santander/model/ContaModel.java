package com.example.santander.model;

public class ContaModel {
    private String nome;
    private String email;
    private Integer agencia;
    private Integer conta;

    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public Integer getAgencia() {
        return agencia;
    }
    public Integer getConta() {
        return conta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }
    public void setConta(Integer conta) {
        this.conta = conta;
    }
}
