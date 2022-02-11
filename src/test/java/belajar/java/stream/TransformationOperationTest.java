package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationTest {
    /**
     * map method mengubah tipe data satu ke tipe data yang lain
     * Sedangkan FlatMap mengubah dari type data ke stream
     */
    @Test
    void testMap() {
        List.of("Akhmad", "Wildan", "Danu").stream()
                .map(name -> name.toUpperCase())
                .map(upper -> upper.length())
                .forEach(length -> System.out.println(length));
    }

    @Test
    void testFlatMap() {
        List.of("Akhmad", "Wildan", "Danu").stream()
                .map(name -> name.toUpperCase())
                .flatMap(upper -> Stream.of(upper, upper.length()))
                .flatMap(value -> Stream.of(value, value))
                .forEach(val -> System.out.println(val));
    }
}
