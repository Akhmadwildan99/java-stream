package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TestStreamOperations {
    @Test
    void createStreamOperationsTest() {
        List<String> names = List.of("Akhmad", "Wildan", "Danu", "Nanu");
        Stream<String> streamNames = names.stream();
        Stream<String> streamUpper = streamNames.map(name -> name.toUpperCase());
        streamUpper.forEach(System.out::println);

        names.forEach(System.out::println);
    }
}
