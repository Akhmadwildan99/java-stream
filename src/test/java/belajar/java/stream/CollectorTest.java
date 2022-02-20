package belajar.java.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorTest {
    @Test
    void testCollectorCollections() {
        Set<String> collectSet = List.of("Akhmad", "Wildan", "Danu", "Nanu", "Ronald", "Rokkie").stream()
                .collect(Collectors.toSet());
        Assertions.assertEquals(6, collectSet.size());

        Set<String> collectImmutable = List.of("Akhmad", "Wildan", "Danu", "Nanu", "Ronald", "Rokkie").stream()
                .collect(Collectors.toUnmodifiableSet());
        Assertions.assertEquals(6, collectImmutable.size());
    }

    @Test
    void testCollectorMap() {
        Map<String, Integer> collectMap = List.of("Akhmad", "Wildan", "Danu", "Nanu", "Ronald", "Rokkie").stream()
                .collect(Collectors.toMap(name -> name, name -> name.length()));
        for (var key : collectMap.keySet()){
            System.out.println(key + ":" + collectMap.get(key));
        }
    }

    @Test
    void testCollectorGroupingBy() {
        Map<String, List<String>> collectName = List.of("Akhmad", "Wildan", "Danu", "Nanu", "Ronald", "Rokkie").stream()
                .collect(Collectors.groupingBy(name -> name.length() > 5 ? "Bessar" : "Kecil"));
        System.out.println(collectName);
    }
}
