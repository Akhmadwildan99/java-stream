package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

public class PrimitiveStreamTest {
    @Test
    void intStreamTest() {
        IntStream.of(1, 2, 3,4 ,5, 6, 7)
                .map(num -> num * 3)
                .forEach(System.out::println);
    }

    @Test
    void intStreamRangeTest() {
        // range antara value ke 1 sampe bilangan yang kurang dari value ke 2
        IntStream.range(1, 7)
                .map(num -> num - 1)
                .forEach(System.out::println);
    }

    @Test
    void intStreamBuilderTest() {
        IntStream build = IntStream.builder().add(1).add(2).build();
        build.average().ifPresent(System.out::println);

        IntStream.range(1, 7)
                .mapToObj(num -> String.valueOf(num))
                .forEach(System.out::println);
    }
}
