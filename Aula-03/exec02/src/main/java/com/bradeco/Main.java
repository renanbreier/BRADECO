package com.bradeco;

import java.util.Scanner;

import com.bradeco.components.ProcessaPedido;
import com.bradeco.components.ValidaEstoque;

public class Main {
    public static void main(String[] args) {
        ValidaEstoque validador = new ValidaEstoque();
        ProcessaPedido processador = new ProcessaPedido();

        processador.connect(validador);

        Scanner sc = new Scanner(System.in);
        validador.exibirCatalogo();

        System.out.print("\nDigite o nome do produto: ");
        String produto = sc.nextLine().toLowerCase();

        System.out.print("Digite a quantidade desejada: ");
        int quantidade = sc.nextInt();

        boolean sucesso = processador.processarPedido(produto, quantidade);

        if (sucesso) {
            validador.atualizarEstoque();
        }

        sc.close();
    }
}