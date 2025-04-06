package com.bradeco.components;

import com.bradeco.interfaces.IGeraPlanoAmortizacao;

public class GeraPlanoAmortizacao implements IGeraPlanoAmortizacao {
    private int periodo;

    public GeraPlanoAmortizacao(int periodo) {
        this.periodo = periodo;
    }

    @Override
    public void update(double montante) {
        System.out.println("\n--- Plano de Pagamento ---");
        System.out.printf("Valor total: R$ %.2f%n", montante);
        System.out.printf("%d parcelas de: R$ %.2f%n", periodo, montante / periodo);
    }
}
