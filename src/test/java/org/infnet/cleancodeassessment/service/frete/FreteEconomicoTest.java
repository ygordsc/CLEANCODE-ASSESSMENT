package org.infnet.cleancodeassessment.service.frete;

import org.infnet.cleancodeassessment.domain.Entrega;
import org.infnet.cleancodeassessment.domain.interfaces.CalculadoraFrete;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FreteEconomicoTest {
    CalculadoraFrete freteEconomico = new FreteEconomico();

    @Test
    public void testFreteValido() {
        assertDoesNotThrow(() -> freteEconomico.calcularFrete(new Entrega("João Silva", "Rua Machado de Assis, 123", 5)));
    }
    @Test
    public void testValorFreteValido() {
        assertEquals(0.5, freteEconomico.calcularFrete(new Entrega("João Silva", "Rua Machado de Assis, 123", 5)));
    }
    @Test
    public void testFreteGratisLimitrofe() {
        assertEquals(0, freteEconomico.calcularFrete(new Entrega("João Silva", "Rua Machado de Assis, 123", 4.5)));
    }
    @Test
    public void testFretePagoLimitrofe() {
        double valor = freteEconomico.calcularFrete(new Entrega("João Silva", "Rua Machado de Assis, 123", 4.6));
        assertEquals("0,06", String.format("%.2f", valor));
    }
    @Test
    public void testGetTipo() {
        assertEquals("Econômico", freteEconomico.getTipo());
    }
}
