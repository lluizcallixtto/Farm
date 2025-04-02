package com.example.farm.models;

public class Vacina extends Produto{
    public Vacina(String nome, int quantidade, String validade) {
        super(nome, quantidade, validade);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Vacina: " + nome + " | Quantidade: " + quantidade + " | Validade: " + validade);
    }

}
