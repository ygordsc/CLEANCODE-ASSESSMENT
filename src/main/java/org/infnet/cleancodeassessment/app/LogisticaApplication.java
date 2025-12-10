package org.infnet.cleancodeassessment.app;

import org.infnet.cleancodeassessment.domain.Entrega;
import org.infnet.cleancodeassessment.domain.interfaces.CalculadoraFrete;
import org.infnet.cleancodeassessment.service.etiqueta.EtiquetaService;
import org.infnet.cleancodeassessment.service.frete.FreteEconomico;
import org.infnet.cleancodeassessment.service.frete.FreteExpresso;
import org.infnet.cleancodeassessment.service.frete.FretePadrao;

public class LogisticaApplication {
    public static void main(String[] args) {
        CalculadoraFrete freteEconomico = new FreteEconomico();
        CalculadoraFrete fretePadrao = new FretePadrao();
        CalculadoraFrete freteExpresso = new FreteExpresso();

        EtiquetaService servicoEco = new EtiquetaService(freteEconomico);
        EtiquetaService servicoPadrao = new EtiquetaService(fretePadrao);
        EtiquetaService servicoExpresso = new EtiquetaService(freteExpresso);

        Entrega entrega = new Entrega("João Silva", "Rua Machado de Assis, 123", 5);
        System.out.println(servicoEco.gerarEtiqueta(entrega));
        System.out.println("\n");
        System.out.println(servicoEco.gerarResumoPedido(entrega));

        System.out.println("\n------------------\n");
        Entrega entrega2 = new Entrega("Pedro Santos", "Rua Olavo Bilac, 234", 5);
        System.out.println(servicoPadrao.gerarEtiqueta(entrega2));
        System.out.println("\n");
        System.out.println(servicoPadrao.gerarResumoPedido(entrega2));

        System.out.println("\n------------------\n");
        Entrega entrega3 = new Entrega("Paulo Souza", "Rua Clarice Lispector, 345", 6);
        System.out.println(servicoExpresso.gerarEtiqueta(entrega3));
        System.out.println("\n");
        System.out.println(servicoExpresso.gerarResumoPedido(entrega3));

    }
}
