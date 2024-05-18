package org.example.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class EmpresaDeSeguros {
    private final List<Cobertura> listaDeSeguros;

    public EmpresaDeSeguros() {
        this.listaDeSeguros = new ArrayList<>();
    }

    public double calcularCostoDeCoberturas() {
        double total = 0;
        for (Cobertura seguro : listaDeSeguros) {
            total += seguro.calcularCosto();
        }
        return total;
    }

    public void guardarSeguro(List<Cobertura> listaDeSeguro) {
        this.listaDeSeguros.addAll(listaDeSeguro);
    }
}
