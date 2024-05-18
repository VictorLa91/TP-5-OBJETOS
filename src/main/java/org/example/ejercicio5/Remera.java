package org.example.ejercicio5;

public abstract class Remera {
    double precioUnitario;
    double impuestos;
    double gananciaComercio;

    public Remera(double precioUni) {
        this.precioUnitario = precioUni;
    }


    public final double calcularCostoFinal() {
        return precioUnitario + calcularImpuestos(precioUnitario) -
                calcularBonificacion(precioUnitario) +
                calcularGananciaDeComercio(precioUnitario);
    }

    protected abstract double calcularGananciaDeComercio(double precioUnitario);

    protected abstract double calcularImpuestos(double precioUnitario);

    protected abstract double calcularBonificacion(double precio);

}
