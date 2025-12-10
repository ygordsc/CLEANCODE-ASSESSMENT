package org.infnet.cleancodeassessment.service.frete;

import org.infnet.cleancodeassessment.domain.Entrega;
import org.infnet.cleancodeassessment.domain.interfaces.CalculadoraFrete;

public class FretePadrao implements CalculadoraFrete {
    @Override
    public double calcularFrete(Entrega entrega) {
        return entrega.getPeso() * 1.2;
    }

    @Override
    public String getTipo() {
        return "Padrão";
    }
}
