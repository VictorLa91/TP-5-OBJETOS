package org.example.ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @org.junit.jupiter.api.Test
    public void testJubiladoSinPromocion() {
        var calculadoraJubilado = new CalculadorJubilado(4);

        assertEquals(calculadoraJubilado.calcularPrecio(1500), 1650);

    }

    @org.junit.jupiter.api.Test
    public void testJubiladoConPromocion() {
        var calculadoraJubilado = new CalculadorJubilado(5);

        assertEquals(calculadoraJubilado.calcularPrecio(1500), 1500);

    }

    @org.junit.jupiter.api.Test
    public void testNoJubiladoConPromocion() {
        var calculadoraJubilado = new CalculadorNoJubilado(5);

        assertEquals(calculadoraJubilado.calcularPrecio(1500), 1725);

    }

    @org.junit.jupiter.api.Test
    public void testNoJubiladoSinPromocion() {
        var calculadoraJubilado = new CalculadorNoJubilado(7);

        assertEquals(calculadoraJubilado.calcularPrecio(1500), 1815);

    }
}
