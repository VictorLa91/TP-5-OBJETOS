package org.example.ejercicio5;

public class RemeraNacional extends Remera {
    private final double gananciaComercio = 0.15;
    private final double impuestos = 0.015;
    private final double bonificacion = 0.20;

    public RemeraNacional(double precioUni) {
        super(precioUni);
    }

    protected double calcularGananciaDeComercio(double precioUnitario) {
        return precioUnitario * gananciaComercio;
    }

    protected double calcularImpuestos(double precioUnitario) {
        return precioUnitario * this.impuestos;
    }

    protected double calcularBonificacion(double precio) {
        return precio * bonificacion;
    }
}
