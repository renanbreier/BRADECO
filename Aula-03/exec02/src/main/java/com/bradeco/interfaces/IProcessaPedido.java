package com.bradeco.interfaces;

public interface IProcessaPedido {
    public void connect(IValidaEstoque componente);
    public boolean processarPedido(String produto, int quantidade); 
}
