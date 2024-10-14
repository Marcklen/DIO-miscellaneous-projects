package br.com.webservicedio.exercicios;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //testes OK para a questão 01
        var questao01 = new Questao01();
        questao01.incrementarValores(List.of(1L, 2L, 3L, 4L, 5L))
                .doOnNext(System.out::println)
                .subscribe();
    }
}
