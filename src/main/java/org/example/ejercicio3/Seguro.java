package org.example.ejercicio3;

public class Seguro extends Cobertura {

    public Seguro(TipoDeCobertura tipo, double costo) {
        super.Tipo = tipo;
        super.costo = costo;

    }

    @Override
    protected double calcularCosto() {
        return this.costo;
    }
}
