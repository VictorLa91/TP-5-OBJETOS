package org.example.ejercicio1;

public class EmpleadoNoRegular implements IEmpleado {

    private final String nombre;
    private final double sueldo;

    public EmpleadoNoRegular(String nombre, double montoSueldo) {
        this.nombre = nombre;
        this.sueldo = montoSueldo;


    }

    @Override
    public double obtenerSueldo() {
        return this.sueldo;
    }
}
