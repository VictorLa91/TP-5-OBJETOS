package org.example.ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @org.junit.jupiter.api.Test
    public void testItem() {
        var task1 = new Tarea();
        var historia = new HistoriaDeUsuario();
        historia.agregarTarea(task1);
        var proyecto = new ProyectoScrum();
        proyecto.agregarTareaAlProyecto(historia);
        proyecto.agregarTareaAlProyecto(task1);

        //Cada historia suma 15, y las tareas 10
        assertEquals(proyecto.calcularTiempoTotalDeProyecto(), 35);

    }

    @org.junit.jupiter.api.Test
    public void testItemConVariasHistorias() {
        var task1 = new Tarea();
        var task2 = new Tarea();
        var historia = new HistoriaDeUsuario();
        historia.agregarTarea(task1);
        historia.agregarTarea(task2);
        var task3 = new Tarea();
        var task4 = new Tarea();
        var historia2 = new HistoriaDeUsuario();
        historia2.agregarTarea(task4);
        historia2.agregarTarea(task3);
        historia2.agregarTarea(task1);
        historia2.agregarTarea(task2);

        var proyecto = new ProyectoScrum();
        proyecto.agregarTareaAlProyecto(historia);
        proyecto.agregarTareaAlProyecto(historia2);

        // las historias sumas 15 y las tareas 10 y debe retornar 90
        assertEquals(proyecto.calcularTiempoTotalDeProyecto(), 90);

    }


}