package com.bradeco.components;

import com.bradeco.interfaces.IProcessaPedido;
import com.bradeco.interfaces.IValidaEstoque;;

public class ProcessaPedido implements IProcessaPedido {
    private IValidaEstoque validador;

    @Override
    public void connect(IValidaEstoque componente) {
        this.validador = componente;
    }
    
    @Override
    public boolean processarPedido(String produto, int quantidade) {
        if (validador != null && validador.validaEstoque(produto, quantidade)) {
            System.out.println("Pedido processado com sucesso: " + quantidade + "x " + produto);
            return true;
        } else {
            System.out.println("Não foi possível processar o pedido.");
            return false;
        }
    }
    
}
