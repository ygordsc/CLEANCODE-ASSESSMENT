package org.infnet.cleancodeassessment.service.etiqueta;

import org.infnet.cleancodeassessment.domain.Entrega;
import org.infnet.cleancodeassessment.domain.interfaces.CalculadoraFrete;

public class EtiquetaService {
    CalculadoraFrete calculadoraFrete;

    public EtiquetaService(CalculadoraFrete calculadoraFrete) {
        this.calculadoraFrete = calculadoraFrete;
    }

    public String gerarEtiqueta(Entrega entrega) {
        double valor = calculadoraFrete.calcularFrete(entrega);

        return "Destinatário: " + entrega.getDestinatario() +
                "\nEndereço: " + entrega.getEndereco() +
                "\nValor do Frete: R$" + String.format("%.2f", valor);
    }

    public String gerarResumoPedido(Entrega entrega) {
        double valor = calculadoraFrete.calcularFrete(entrega);

        return "Pedido para " + entrega.getDestinatario() +
                " com frete tipo " + calculadoraFrete.getTipo() +
                " no valor de R$" + String.format("%.2f", valor);
    }
}
