package org.example.course01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.function.BiPredicate;

import org.junit.jupiter.api.Test;

public class BiPredicateTest {
    @Test
    public void biPredicate_test01() {
        BiPredicate<List<Integer>, Integer> filter = (x, y) -> {
            return x.contains(y);
        };

        assertTrue(filter.test(List.of(1, 2, 3, 4), 2));

        assertFalse(filter.test(List.of(1, 2, 3, 4), 0));
    }

    @Test
    public void biPredicate_test02() {
        List<Domain> of = List.of(
                    new Domain("microsoft.com", 2), 
                    new Domain("google.com", 5), 
                    new Domain("github.com", 2)
                    );
        var res = filterBadDomain(of, (d, t) -> t < 5);
        assertEquals(2, res.size());

        var res2 = filterBadDomain(of, (d, t) -> d.startsWith("g") && t >= 5);

        assertEquals(1, res2.size());
        
    }

    private static <T extends Domain> List<T> filterBadDomain(
            List<T> list, BiPredicate<String, Integer> biPredicate) {

        return list.stream()
                .filter(x -> biPredicate.test(x.name(), x.ttl()))
                .toList();

    }
}

record Domain(String name, Integer ttl) {

}