package br.com.webservicedio.exercicios;

public record User(
        Long id,
        String nome,
        String email,
        String password,
        Boolean isAdmin
) {
}
