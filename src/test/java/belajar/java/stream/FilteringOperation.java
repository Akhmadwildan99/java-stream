package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOperation {
    @Test
    void testFilter() {
        List.of("Akhmad", "Wildan", "Danu", "Nanu").stream()
                .filter(name -> name.length() > 4)
                .forEach(System.out::println);

        List.of(1, 2, 3,4,5, 6, 7, 8 ).stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }

    @Test
    void testDistinct() {
        List.of("Akhmad", "Wildan", "Danu", "Nanu", "Nanu", "wildan", "akhmad").stream()
                .map(name -> name.toLowerCase())
                .distinct()
                .forEach(System.out::println);
    }
}
