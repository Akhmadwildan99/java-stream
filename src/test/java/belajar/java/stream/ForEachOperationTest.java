package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperationTest {
    @Test
    void testForEachOperation() {
        List.of("Akhmad", "Wildan", "Danu", "Programer", "Zaman", "Now").stream()
                .map(String::toUpperCase)
                .peek(name -> System.out.println("Mr." + name))
                .forEach(System.out::println);
    }
}
