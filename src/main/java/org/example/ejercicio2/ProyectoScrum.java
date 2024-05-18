package org.example.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class ProyectoScrum {
    private final List<Item> listaTareas;

    public ProyectoScrum() {
        listaTareas = new ArrayList<>();
    }

    public void agregarTareaAlProyecto(Item tarea) {
        listaTareas.add(tarea);
    }

    public int calcularTiempoTotalDeProyecto() {
        int tiempo = 0;
        for (Item item : listaTareas) {
            tiempo += item.calcularTiempoDeProyecto();
        }
        return tiempo;
    }
}
