package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class RetrievingSingleElementTest {
    @Test
    void testLimit() {
        List.of("Akhmad", "Wildan", "Danu", "Nanu", "Paulo", "Sagala", "Thomas").stream()
                .limit(4)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Akhmad", "Wildan", "Danu", "Nanu", "Paulo", "Sagala", "Thomas").stream()
                .skip(5)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("Akhmad", "Wildan", "Danu", "Nanu", "Paulo", "Sagala", "Thomas").stream()
                .takeWhile(name -> name.length() > 4)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        List.of("Akhmad", "Wildan", "Danu", "Nanu", "Paulo", "Sagala", "Thomas").stream()
                .dropWhile(name -> name.length() > 4)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        List.of("Akhmad", "Wildan", "Danu", "Nanu", "Paulo", "Sagala", "Thomas").stream()
                .findAny()
                .ifPresent(s -> System.out.println(s));
    }

    @Test
    void testFindFirst() {
        List.of("Akhmad", "Wildan", "Danu", "Nanu", "Paulo", "Sagala", "Thomas").stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
