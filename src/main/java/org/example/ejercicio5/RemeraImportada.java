package org.example.ejercicio5;

public class RemeraImportada extends Remera {
    private final double gananciaComercio = 0.25;
    private final double impuestos = 0.08;
    private final double bonificacion = 0;

    public RemeraImportada(double precioUni) {
        super(precioUni);
    }

    protected double calcularGananciaDeComercio(double precioUnitario) {
        return precioUnitario * gananciaComercio;
    }

    protected double calcularImpuestos(double precioUnitario) {
        return precioUnitario * impuestos;
    }

    protected double calcularBonificacion(double precio) {
        return precio * bonificacion;
    }
}

