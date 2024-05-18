package org.example.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class HistoriaDeUsuario implements Item {
    private final List<Item> listaItem;

    public HistoriaDeUsuario() {
        listaItem = new ArrayList<>();
    }

    @Override
    public int calcularTiempoDeProyecto() {
        var tiempo = 15;
        for (Item item : listaItem) {
            tiempo += item.calcularTiempoDeProyecto();
        }
        return tiempo;
    }

    public void agregarTarea(Item tarea) {
        listaItem.add(tarea);
    }
}
