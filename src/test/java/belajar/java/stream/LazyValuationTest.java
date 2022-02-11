package belajar.java.stream;

import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;

public class LazyValuationTest {
    @Test
    void testIntermediateOperation() {
        /**
         * Stream akan berhenti apabila ditriger dengan method yang
         * return datanya bukan type Stream.
         */
        Stream<String> stream = Stream.of("Akhmad", "Wildan", "Danu")
                .map(names -> {
                    System.out.println("Konversi " + names + " ke UPPERCASE");
                    return names.toUpperCase();
                })
                .map(val -> {
                    System.out.println("Change " + val + " to Mr.");
                   return  "Mr. " + val;
                });
        stream.forEach(System.out::println);

//        List<String> names = List.of("Akhmad", "Wildan", "Danu");
//        names.stream()
//                .map(name -> {
//                    System.out.println("Change " + name + " to UPPERCASE");
//                    return name.toUpperCase();
//                })
//                .map(upper -> {
//                    System.out.println("Change " + upper + " to Mr.");
//                    return "Mr." + upper;
//                })
//                .forEach(mr -> System.out.println(mr));
    }
}
