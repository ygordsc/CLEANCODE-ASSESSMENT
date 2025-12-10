package org.infnet.cleancodeassessment.domain;

import lombok.Getter;

@Getter
public class Entrega {
    private final String destinatario;
    private final String endereco;
    private final double peso;

    public Entrega(String destinatario, String endereco, double peso) {
        this.destinatario = validarTexto(destinatario);
        this.endereco = validarTexto(endereco);
        this.peso = validarPeso(peso);
    }

    private String validarTexto(String texto) {
        if (texto == null || texto.isEmpty()) {
            throw new IllegalArgumentException("Texto vazio");
        }
        return texto;
    }

    private double validarPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso inválido");
        }
        return peso;
    }
}
