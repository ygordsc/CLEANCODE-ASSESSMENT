package org.infnet.cleancodeassessment.service.frete;

import org.infnet.cleancodeassessment.domain.Entrega;
import org.infnet.cleancodeassessment.domain.interfaces.CalculadoraFrete;

public class FreteEconomico implements CalculadoraFrete {

    @Override
    public double calcularFrete(Entrega entrega) {
        return Math.max(0, entrega.getPeso() * 1.1 - 5);
    }

    @Override
    public String getTipo() {
        return "Econômico";
    }
}
