package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
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

    @Test
    void testCreateStreamFromCollectionInterface() {
        Collection<String> stringCollection = List.of("Akhmad", "Wildan", "Danu");
        Stream<String> stringStream = stringCollection.stream();
        stringStream.forEach(System.out::println);
        Stream<String> stringStream2 = stringCollection.stream();
        stringStream2.forEach(System.out::println);
        // Karena stream adalah aliran maka tidak bisa dijalankan lebih dari satu kali,
        // Jika dijalankan lebih dari satu akan terjadi error,
        // Solusinya adalah menginisiasi stream baru.
    }

    @Test
    void testCreateInfiniteStream() {
        Stream<String> stringStream = Stream.generate(() -> "Akhmad Wildan");
        // stringStream.forEach(System.out::println);
        Stream<Integer> integerStream = Stream.iterate(1, value -> value + 1);
        // integerStream.forEach(System.out::println);
    }
}
