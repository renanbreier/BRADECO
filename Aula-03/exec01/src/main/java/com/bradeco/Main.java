package com.bradeco;

import java.util.Scanner;

import com.bradeco.components.CalculaJuros;
import com.bradeco.components.GeraPlanoAmortizacao;

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do empréstimo (principal): ");
        double principal = sc.nextDouble();

        System.out.print("Digite a taxa de juros mensal (ex: 0,05 para 5%): ");
        double taxa = sc.nextDouble();

        System.out.print("Digite o número de meses (períodos): ");
        int periodos = sc.nextInt();

        CalculaJuros juros = new CalculaJuros(principal, taxa, periodos);
        GeraPlanoAmortizacao plano = new GeraPlanoAmortizacao(periodos);

        juros.connect(plano);

        sc.close();
    }
}