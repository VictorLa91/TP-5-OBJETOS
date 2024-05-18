package org.example.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @org.junit.jupiter.api.Test
    public void testearSueldosEmpleados() {
        var empresa = new EmpresaLeserX();
        empresa.agregarEmpleado(new Empleado("Victor", "Director", 30));
        empresa.agregarEmpleado(new Empleado("Salvio", "Lider de Proyecto", 10));
        empresa.agregarEmpleado(new Empleado("Ezequiel", "Gerente", 40));

        assertEquals(empresa.calcularCostoTotalSalarial(), 80);
    }

    @org.junit.jupiter.api.Test
    public void testearSueldosEmpleadosACargo() {
        var empresa = new EmpresaLeserX();
        var Director = new Empleado("Victor", "Director", 30);
        var gerente = new Empleado("Ezequiel", "Gerente", 40);
        Director.agregarEmpleadoACargo(gerente);
        var empleadosMedios = new Empleado("Ezequiel", "Mando Medio", 40);
        gerente.agregarEmpleadoACargo(empleadosMedios);
        var liderDeProyecto = new Empleado("Ezequiel", "Lider de Proyecto", 40);
        empleadosMedios.agregarEmpleadoACargo(liderDeProyecto);
        var empleadoNoRegular = new EmpleadoNoRegular("Salvio", 10);
        liderDeProyecto.agregarEmpleadoACargo(empleadoNoRegular);
        empresa.agregarEmpleado(Director);

        assertEquals(empresa.calcularCostoTotalSalarial(), 160);
    }
}
