package org.example.ejercicio3;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @org.junit.jupiter.api.Test
    public void testSegurosIndividuales() {

        var seguroDeVida = new Seguro(TipoDeCobertura.SeguroDeVida, 100);
        var seguroDeAuto = new Seguro(TipoDeCobertura.SeguroAutomovil, 120);
        var seguroMedico = new Seguro(TipoDeCobertura.SeguroMedico, 140);

        List<Cobertura> seguros = List.of(seguroDeVida, seguroDeAuto, seguroMedico);
        var EmpresaDeSeguroa = new EmpresaDeSeguros();
        EmpresaDeSeguroa.guardarSeguro(seguros);


        assertEquals(EmpresaDeSeguroa.calcularCostoDeCoberturas(), 360);


    }

    @org.junit.jupiter.api.Test
    public void testPaquetesDeSeguros() {
        var seguroDeVida = new Seguro(TipoDeCobertura.SeguroDeVida, 100);
        var seguroDeAuto = new Seguro(TipoDeCobertura.SeguroAutomovil, 120);
        var seguroMedico = new Seguro(TipoDeCobertura.SeguroMedico, 140);
        var paquete1 = new PaqueteDeSeguro();
        paquete1.agregarSeguroAlPaquete(List.of(seguroDeVida, seguroDeAuto, seguroMedico));
        List<Cobertura> seguros = List.of(paquete1, seguroDeVida);

        var EmpresaDeSeguroa = new EmpresaDeSeguros();
        EmpresaDeSeguroa.guardarSeguro(seguros);


        assertEquals(EmpresaDeSeguroa.calcularCostoDeCoberturas(), 406);


    }

}
