package org.infnet.cleancodeassessment.service.etiqueta;

import org.infnet.cleancodeassessment.domain.Entrega;
import org.infnet.cleancodeassessment.service.frete.FretePadrao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EtiquetaServiceTest {
    EtiquetaService service = new EtiquetaService(new FretePadrao());

    @Test
    public void testEtiqueta() {
        String etiqueta = service.gerarEtiqueta(new Entrega("João Silva", "Rua Machado de Assis, 123", 5));
        assertEquals("Destinatário: João Silva\nEndereço: Rua Machado de Assis, 123\nValor do Frete: R$6,00", etiqueta);
    }
    @Test
    public void testResumoPedido() {
        String resumo = service.gerarResumoPedido(new Entrega("João Silva", "Rua Machado de Assis, 123", 5));
        assertEquals("Pedido para João Silva com frete tipo Padrão no valor de R$6,00", resumo);
    }
}
