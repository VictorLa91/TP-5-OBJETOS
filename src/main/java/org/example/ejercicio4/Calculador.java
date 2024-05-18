package org.example.ejercicio4;

public abstract class Calculador {
    private final LogTransaction log;
    protected int mesEnPromocion;

    public Calculador(int mesEnPromocion) {
        this.mesEnPromocion = mesEnPromocion;
        this.log = new LogTransaction();
    }

    public final double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto;
        precioTotal = descuentoPorPromocion(precioTotal);
        log.log(CalculadorNoJubilado.class.getName());
        return precioTotal;
    }

    protected abstract double descuentoPorPromocion(double precioProducto);
}