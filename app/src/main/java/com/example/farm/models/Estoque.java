package com.example.farm.models;

import com.example.farm.interfaces.GerenciadorEstoque;

import java.util.ArrayList;

public class Estoque implements GerenciadorEstoque {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();


    @Override
    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
        System.out.println(produto.nome + " adicionado ao estoque.");
    }

    @Override
    public void removerProduto(String nome) {
        listaProdutos.removeIf(produto -> produto.nome.equals(nome));
        System.out.println(nome + " removido do estoque.");
    }

    @Override
    public void listarEstoque() {
        for (Produto produto : listaProdutos) {
            produto.exibirDetalhes();
        }
    }
}
