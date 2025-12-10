package org.infnet.cleancodeassessment.domain.interfaces;

import org.infnet.cleancodeassessment.domain.Entrega;

public interface CalculadoraFrete {
    double calcularFrete(Entrega entrega);
    String getTipo();
}
