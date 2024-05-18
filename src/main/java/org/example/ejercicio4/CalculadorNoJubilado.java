package org.example.ejercicio4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorNoJubilado extends Calculador {

    public CalculadorNoJubilado(int mesEnPromocion) {
        super(mesEnPromocion);
    }

    @Override
    protected double descuentoPorPromocion(double precioProducto) {
        double precioTotal = precioProducto;
        if (of(mesEnPromocion).equals(now().getMonth())) {
            precioTotal += precioProducto * 0.15;
        } else {
            precioTotal += precioProducto * 0.21;
        }
        return precioTotal;
    }


}
