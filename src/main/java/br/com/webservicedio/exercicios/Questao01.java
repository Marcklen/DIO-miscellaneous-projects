package br.com.webservicedio.exercicios;

import reactor.core.publisher.Flux;

import java.util.List;

public class Questao01 {

    //Recebe uma lista de longs, incrementa 1 nos valores e retorna um flux dos resultados
    public Flux<Long> incrementarValores(final List<Long> numeros) {
        return Flux.fromIterable(numeros)
                .map(numero -> numero + 1);

    }
}
