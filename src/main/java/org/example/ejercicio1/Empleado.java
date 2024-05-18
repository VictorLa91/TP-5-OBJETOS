package org.example.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Empleado implements IEmpleado {
    private final List<IEmpleado> listaEmpleadoACargo;
    private final String cargo;
    private final String nombre;
    private final double sueldo;

    public Empleado(String nombre, String cargo, double montoSueldo) {
        listaEmpleadoACargo = new ArrayList<>();
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldo = montoSueldo;


    }

    public double obtenerSueldo() {
        double monto = this.sueldo;
        for (IEmpleado empleado : listaEmpleadoACargo) {
            monto += empleado.obtenerSueldo();
        }
        return monto;
    }

    public void agregarEmpleadoACargo(IEmpleado unEmpleado) {
        this.listaEmpleadoACargo.add(unEmpleado);
    }


}
