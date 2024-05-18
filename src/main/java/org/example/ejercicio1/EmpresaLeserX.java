package org.example.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class EmpresaLeserX {
    private final List<Empleado> listaDeEmpleados;

    public EmpresaLeserX() {
        listaDeEmpleados = new ArrayList<Empleado>();
    }

    public double calcularCostoTotalSalarial() {
        double total = 0;
        for (Empleado empleado : listaDeEmpleados) {
            total += empleado.obtenerSueldo();
        }
        return total;
    }

    public void agregarEmpleado(Empleado unEmpleado) {
        this.listaDeEmpleados.add(unEmpleado);
    }
}
