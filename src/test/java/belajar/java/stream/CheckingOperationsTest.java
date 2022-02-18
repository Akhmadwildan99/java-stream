package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CheckingOperationsTest {
    @Test
    void testAnyMatch() {
        boolean anyMatch = List.of("Akhmad", "Wildan", "Danu", "Programer", "Zaman", "Now").stream()
                .anyMatch(name -> !name.isEmpty());
        System.out.println(anyMatch);
    }

    @Test
    void testAllMatch() {
        boolean allMatch = List.of("Akhmad", "Wildan", "Danu", "Programer", "Zaman", "Now").stream()
                .allMatch(name -> name.length() >= 3);
        System.out.println(allMatch);
    }

    @Test
    void testNoneMatch() {
        boolean noneMatch = List.of("Akhmad", "Wildan", "Danu", "Programer", "Zaman", "Now").stream()
                .noneMatch(name -> name.isEmpty());
        System.out.println(noneMatch);
    }
}
