package br.com.webservicedio.exercicios;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Questao01Test {

    private Questao01 questao01;
    private final Faker faker = new Faker();

    @BeforeEach
    void setup() {
        questao01 = new Questao01();
    }

    @Test
    void testIncrementarValores() {
        var numbers = Stream.generate(() -> faker.number().randomNumber())
                .limit(faker.number().randomDigitNotZero())
                .toList();
        StepVerifier.create(questao01.incrementarValores(numbers))
                .recordWith(ArrayList::new)
                .thenConsumeWhile(actual -> true)
                .consumeRecordedWith(actual -> {
                    var actualList = new ArrayList<>(actual);
                    IntStream.range(0, actual.size())
                            .forEach(i -> assertEquals(actualList.get(i), numbers.get(i) + 1L));
                })
                .verifyComplete();
    }

    @AfterEach
    void tearDown() {
        questao01 = null;
    }
}