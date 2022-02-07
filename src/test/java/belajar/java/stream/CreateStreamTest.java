package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreateStreamTest {
    @Test
    void createEmptyOrSingleStream() {
        Stream<String> empty = Stream.empty();
        empty.forEach(item -> System.out.println(item));
        Stream<String> notNull = Stream.of("Akhmad", "Wildan", "Danu");
        notNull.forEach(value -> System.out.println(value));
        Stream<String> nullAble = Stream.ofNullable(null);
        nullAble.forEach(data -> System.out.println(data));
    }

    @Test
    void creteStreamFromArray() {
        Stream<String> names = Stream.of("Akhmad", "Wildan", "Danu");
        names.forEach(System.out::println);
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4,5 ,6 ,7 ,8 );
        integerStream.forEach(System.out::println);
        String[] myNames = {"Wildan", "Akhmad", "Danu", "Nanu"};
        Stream<String> stringStream = Arrays.stream(myNames);
        stringStream.forEach(System.out::println);
    }
}
