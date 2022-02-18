package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationsTest {
    @Test
    void testSorted() {
        List.of("Akhmad", "Wildan", "Danu", "Programer", "Zaman", "Now").stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Comparator<String> reversedComparator = Comparator.reverseOrder();

        List.of("Akhmad", "Wildan", "Danu", "Programer", "Zaman", "Now").stream()
                .sorted(reversedComparator)
                .forEach(System.out::println);
    }
}
