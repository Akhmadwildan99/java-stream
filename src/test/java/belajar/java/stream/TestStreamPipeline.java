package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class TestStreamPipeline {
    @Test
    void testCreateStreamPipeline() {
        List<String> list = List.of("Akhmad", "Wildan", "Danu", "Nanu");
        list.stream()
                .map(String::toUpperCase)
                .map(name -> "Mr. " + name)
                .forEach(System.out::println);
    }
}
