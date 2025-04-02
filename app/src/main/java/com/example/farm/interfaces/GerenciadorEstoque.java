package com.example.farm.interfaces;

import com.example.farm.models.Produto;

public interface GerenciadorEstoque {
    void adicionarProduto(Produto produto);
    void removerProduto(String nome);
    void listarEstoque();
}
