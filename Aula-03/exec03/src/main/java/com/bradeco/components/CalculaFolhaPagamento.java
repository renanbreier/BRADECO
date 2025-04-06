package com.bradeco.components;

import com.bradeco.interfaces.ICalculaFolhaPagamento;
import com.bradeco.interfaces.ICalculaHoras;

public class CalculaFolhaPagamento implements ICalculaFolhaPagamento {
    private ICalculaHoras calculadoraHoras;

    @Override
    public void connect(ICalculaHoras componente) {
        this.calculadoraHoras = componente;
    }

    @Override
    public void calcularPagamento(String funcionario, double valorHora) {
        int horas = calculadoraHoras.calculaHorasTrabalhadas(funcionario);
        if (horas > 0) {
            double pagamento = horas * valorHora;
            System.out.println("Pagamento de " + funcionario + ": R$ " + pagamento);
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
}
