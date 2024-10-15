package br.com.webservicedio.exercicios;

import reactor.core.publisher.Mono;

public class Questao03 {

    /**
     * Verifica se o usuário passado é valido, caso seja retorna void, caso contrário deve disparar uma exception
     * (para esse desafio vamos considerar que o usário é valido quando ele tem uma senha com mais de 8 caractéres)
     */
    public Mono<Void> usuarioEhValido(final User user) {
        return Mono
                .just(user)
                .doOnNext(u -> {
                    if (u.password().length() < 8) {
                        throw new RuntimeException("Senha inválida");
                    } else {
                        System.out.println("Usuário válido");
                    }
                })
                .then();
    }
}
