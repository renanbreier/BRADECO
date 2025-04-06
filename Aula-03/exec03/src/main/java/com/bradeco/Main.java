package com.bradeco;

import java.util.Scanner;

import com.bradeco.components.CalculaFolhaPagamento;
import com.bradeco.components.CalculaHoras;

public class Main {
    public static void main(String[] args) {
        CalculaHoras calculadoraHoras = new CalculaHoras();
        CalculaFolhaPagamento folha = new CalculaFolhaPagamento();

        folha.connect(calculadoraHoras);

        Scanner sc = new Scanner(System.in);
        calculadoraHoras.listaFuncionario();

        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Valor da hora trabalhada: ");
        double valorHora = sc.nextDouble();

        folha.calcularPagamento(nome, valorHora);
        sc.close();
    }
}