package org.infnet.cleancodeassessment.service.frete;

import org.infnet.cleancodeassessment.domain.Entrega;
import org.infnet.cleancodeassessment.domain.interfaces.CalculadoraFrete;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FretePadraoTest {
    CalculadoraFrete fretePadrao = new FretePadrao();

    @Test
    public void testFreteValido() {
        assertDoesNotThrow(() -> fretePadrao.calcularFrete(new Entrega("João Silva", "Rua Machado de Assis, 123", 5)));
    }
    @Test
    public void testValorFreteValido() {
        assertEquals(6, fretePadrao.calcularFrete(new Entrega("João Silva", "Rua Machado de Assis, 123", 5)));
    }
    @Test
    public void testGetTipo() {
        assertEquals("Padrão", fretePadrao.getTipo());
    }
}
