package org.infnet.cleancodeassessment.service.frete;

import org.infnet.cleancodeassessment.domain.Entrega;
import org.infnet.cleancodeassessment.domain.interfaces.CalculadoraFrete;

public class FreteEconomico implements CalculadoraFrete {
    private final double VALOR_FRETE_GRATIS = 2;

    @Override
    public double calcularFrete(Entrega entrega) {
        if (entrega.getPeso() < VALOR_FRETE_GRATIS) {
            return 0;
        }
        return Math.max(0, entrega.getPeso() * 1.1 - 5);
    }

    @Override
    public String getTipo() {
        return "Econômico";
    }
}
