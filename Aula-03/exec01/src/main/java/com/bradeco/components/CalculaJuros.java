package com.bradeco.components;

import com.bradeco.interfaces.ICalculaJuros;
import com.bradeco.interfaces.IGeraPlanoAmortizacao;

public class CalculaJuros implements ICalculaJuros {
    private double principal;
    private double taxa;
    private int periodo;

    public CalculaJuros(double principal, double taxa, int periodo) {
        this.principal = principal;
        this.taxa = taxa;
        this.periodo = periodo;
    }

    public double calcularMontante() {
        double fator = 1.0;
        for (int i = 0; i < periodo; i++) {
            fator *= (1 + taxa);
        }
        return principal * fator;
    }

    @Override
    public void connect(IGeraPlanoAmortizacao componente) {
        componente.update(calcularMontante());
    }
}
