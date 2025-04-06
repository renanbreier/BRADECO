package com.bradeco.interfaces;

public interface ICalculaFolhaPagamento {
    public void connect(ICalculaHoras componente);
    public void calcularPagamento(String funcionario, double valorHora);
}
