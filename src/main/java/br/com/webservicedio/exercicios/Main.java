package br.com.webservicedio.exercicios;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //testes OK para a questão 01
//        var questao01 = new Questao01();
//        questao01.incrementarValores(List.of(1L, 2L, 3L, 4L, 5L))
//                .doOnNext(System.out::println)
//                .subscribe();

        //testes OK para a questão 02
        var questao02 = new Questao02();
        questao02.contarAdmins(List.of(
                        new User(1L, "Marcklen", "marcklen@email.com", "123456789", true),
                        new User(2L, "Monteiro", "monteiro@email.com", "123456789", false),
                        new User(3L, "Guimaraes", "guimaraes@email.com", "123456789", true)))
                .doOnNext(System.out::println)
                .subscribe();
    }
}
