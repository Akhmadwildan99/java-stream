package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilder {
    @Test
    void testCreateStreamBuilder() {
        Stream.Builder<String> streamString = Stream.builder();
        streamString.accept("Akhmad");
        streamString.add("Wildan");
        streamString.add("Danu");
        Stream<String> buildString = streamString.build();
        buildString.forEach(System.out::println);
    }

    @Test
    void testCreateStreamSimplify() {
        Stream.Builder<Object> builder = Stream.builder().add("Akhmad").add("Hikaru").add("Tamayo").add("Sergio");
        Stream<Object> stream = builder.build();
        stream.forEach(System.out::println);
        // builder.add("junu");
        // Error throw IllegalStateException jika add() atau
        // accept() dilakukan setelah nge- build() stream

    }
}
