package com.example.farm.models;

public class Alimento extends Produto{
    public Alimento(String nome, int quantidade, String validade) {
        super(nome, quantidade, validade);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Alimento: " + nome + " | Quantidade: " + quantidade + " | Validade: " + validade);
    }

}
