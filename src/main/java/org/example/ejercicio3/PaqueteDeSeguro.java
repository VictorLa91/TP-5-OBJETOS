package org.example.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class PaqueteDeSeguro extends Cobertura {
    private final List<Cobertura> listaDeSeguro;
    private double descuento = 0;

    public PaqueteDeSeguro() {
        listaDeSeguro = new ArrayList<>();
    }

    @Override
    public double calcularCosto() {
        double total = 0;
        for (Cobertura seguro : listaDeSeguro) {
            total += seguro.calcularCosto();
            descuento += 5;
        }

        return total - (total * descuento / 100);
    }

    public void agregarSeguroAlPaquete(List<Cobertura> seguros) {
        listaDeSeguro.addAll(seguros);
    }
}
