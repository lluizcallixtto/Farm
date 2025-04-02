package com.example.farm.models;

public abstract class Produto {
    protected String nome;
    protected int quantidade;
    protected String validade;

    public Produto(String nome, int quantidade, String validade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.validade = validade;
    }

    public abstract void exibirDetalhes();
}
