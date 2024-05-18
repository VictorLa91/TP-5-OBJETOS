package org.example.ejercicio3;

public abstract class Cobertura {
    protected Enum Tipo;
    protected double costo;

    public Cobertura() {
    }

    protected abstract double calcularCosto();

}

