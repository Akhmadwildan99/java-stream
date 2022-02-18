package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class AggregationOperationsTest {
    @Test
    void testMax() {
        Stream.of("Akhmad", "Wildan", "Danu", "Programer", "Zaman", "Now")
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testMin() {
        Stream.of("Akhmad", "Wildan", "Danu", "Programer", "Zaman", "Now")
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testCount() {
        long count = Stream.of("Akhmad", "Wildan", "Danu", "Programer", "Zaman", "Now")
                .count();

        System.out.println(count);
    }

    @Test
    void testSum(){
        Integer result = List.of(1, 2, 3, 4, 5).stream()
                .reduce(0, (value, item) -> value + item);

        System.out.println(result);
    }
}
