package org.example.course01;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class PredicateTest {
    @Test
    public void predicate_and_test01() {
        Predicate<Integer> noGreaterThan5 = x -> x > 5;
        Predicate<Integer> noLessThan8 = x -> x < 8;

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = list.stream()
                .filter(noGreaterThan5.and(noLessThan8))
                .toList();

        assertIterableEquals(List.of(6, 7), collect);
    }

    @Test
    public void predicate_or_test01() {
        Predicate<Integer> noGreaterThan5 = x -> x % 2 == 0;
        Predicate<Integer> noLessThan8 = x -> x % 5 == 0;

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = list.stream()
                .filter(noGreaterThan5.or(noLessThan8))
                .toList();

        assertIterableEquals(List.of(2, 4, 5, 6, 8, 10), collect);
    }

    @Test
    public void predicate_negate_test01() {
        Predicate<String> startWithA = x -> x.startsWith("A");

        List<String> list = Arrays.asList("Apple", "Orange", "berry", "pomelo", "lemon");

        List<String> collect = list.stream()
                .filter(startWithA.negate())
                .toList();

        assertIterableEquals(List.of("Orange", "berry", "pomelo", "lemon"), collect);
    }
    private static List<String> filter(List<String> list, Predicate<String> predicate) {
        return list.stream().filter(predicate::test).toList();
    }

    @Test
    public void predicate_test_test01()  {
        List<String> list = Arrays.asList("Apple", "Orange", "berry", "pomelo", "lemon");
        var res = filter(list, x -> x.contains("a"));

        assertIterableEquals(List.of("Orange"), res);
    }
}
