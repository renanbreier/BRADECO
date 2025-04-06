package com.bradeco.components;

import java.util.HashMap;
import java.util.Map;

import com.bradeco.interfaces.ICalculaHoras;

public class CalculaHoras implements ICalculaHoras {
    private Map<String, Integer> bancoHoras;

    public CalculaHoras() {
        bancoHoras = new HashMap<>();
        bancoHoras.put("renan", 170);
        bancoHoras.put("luiza", 140);
        bancoHoras.put("mariana", 193);
        bancoHoras.put("rafael", 80);
        bancoHoras.put("rafaely", 30);
    }

    public void listaFuncionario() {
        System.out.println("=== Lista de Funcionários ===");
        for (String produto : bancoHoras.keySet()) {
            System.out.println("- " + produto);
        }
    }

    @Override
    public int calculaHorasTrabalhadas(String funcionario) {
        return bancoHoras.getOrDefault(funcionario.toLowerCase(), 0);
    }
}
