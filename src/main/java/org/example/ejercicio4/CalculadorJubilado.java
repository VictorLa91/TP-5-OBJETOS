package org.example.ejercicio4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorJubilado extends Calculador {


    public CalculadorJubilado(int mesEnPromocion) {
        super(mesEnPromocion);


    }

    @Override
    protected double descuentoPorPromocion(double precioProducto) {
        double precioTotal = precioProducto;
        if (!of(mesEnPromocion).equals(now().getMonth())) {
            precioTotal += precioProducto * 0.1;
        }
        return precioTotal;
    }
}