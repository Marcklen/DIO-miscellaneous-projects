package br.com.webservicedio.exercicios;

import reactor.core.publisher.Mono;

import java.util.List;

public class Questao02 {

    // Recebe uma lista de usuários e retorna a quantos usuários admin tem na lista
    public Mono<Long> contarAdmins(final List<User> usuarios) {
        return Mono
                .just(usuarios
                        .stream()
                        .filter(User::isAdmin)
                        .count());
    }
}
