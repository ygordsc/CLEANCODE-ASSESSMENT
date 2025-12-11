package org.infnet.cleancodeassessment.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EntregaTest {
    @Test
    public void testInstanciaValida() {
        assertDoesNotThrow(() -> new Entrega("João Silva", "Rua Machado de Assis, 123", 5));
    }
    @Test
    public void testPesoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> new Entrega("João Silva", "Rua Machado de Assis, 123", -5));
    }
    @Test
    public void testPesoZero() {
        assertThrows(IllegalArgumentException.class, () -> new Entrega("João Silva", "Rua Machado de Assis, 123", 0));
    }
    @Test
    public void testPesoCaracteres() {
        assertThrows(IllegalArgumentException.class, () -> new Entrega("João Silva", "Rua Machado de Assis, 123", Double.parseDouble("abc")));
    }
    @Test
    public void testTextoVazio() {
        assertThrows(IllegalArgumentException.class, () -> new Entrega("", "Rua Machado de Assis, 123", 5));
    }
    @Test
    public void testTextoComEspaco() {
        assertThrows(IllegalArgumentException.class, () -> new Entrega(" ", "Rua Machado de Assis, 123", 5));
    }
    @Test
    public void testTextoNulo() {
        assertThrows(IllegalArgumentException.class, ()-> new Entrega(null, "Rua Machado de Assis, 123", 5));
    }
}
