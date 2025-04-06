package com.bradeco.components;

import com.bradeco.interfaces.IValidaEstoque;
import java.util.HashMap;
import java.util.Map;

public class ValidaEstoque implements IValidaEstoque {
    private Map<String, Integer> estoque;

    public ValidaEstoque() {
        estoque = new HashMap<>();
        estoque.put("pendrive", 15);
        estoque.put("carregador", 20);
        estoque.put("teclado", 6);
        estoque.put("mouse", 6);
        estoque.put("headset", 17);
        estoque.put("roteador", 3);
    }

    public void exibirCatalogo() {
        System.out.println("=== Catálogo de Produtos Disponíveis ===");
        for (String produto : estoque.keySet()) {
            System.out.println("- " + produto);
        }
    }

    public void atualizarEstoque() {
        System.out.println("\n=== Estoque Atualizado ===");
        for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " unidades");
        }
    }

    @Override
    public boolean validaEstoque(String produto, int quantidade) {
        if (!estoque.containsKey(produto)) {
            System.out.println("Produto não disponível no estoque.");
            return false;
        }

        int qtdDisponivel = estoque.get(produto);
        if (quantidade <= qtdDisponivel) {
            estoque.put(produto, qtdDisponivel - quantidade);
            return true;
        } else {
            System.out.println("Quantidade insuficiente no estoque.");
            return false;
        }
    }
}
