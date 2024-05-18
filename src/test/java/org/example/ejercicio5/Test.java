package org.example.ejercicio5;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {


    @org.junit.jupiter.api.Test
    public void testRemeraNacional() {
        var remera = new RemeraNacional(200);

        assertEquals(remera.calcularCostoFinal(), 193);

    }

    @org.junit.jupiter.api.Test
    public void testRemeraInternacional() {
        var remera = new RemeraImportada(200);

        assertEquals(remera.calcularCostoFinal(), 266);

    }

}
