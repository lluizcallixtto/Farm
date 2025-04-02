package com.example.farm.models;

public class Relatorio {
    public static void gerarRelatorio(Estoque estoque) {
        System.out.println("Gerando relatório do estoque...");
        estoque.listarEstoque();
    }
}
