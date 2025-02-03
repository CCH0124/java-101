package org.example.course01;

import java.util.function.BiConsumer;

import org.junit.jupiter.api.Test;

public class BiConsumerTest {
    private static <Integer> void math(Integer a1, Integer a2, BiConsumer<Integer, Integer> c) {
        c.accept(a1, a2);
    }

    @Test
    public void biConsumer_test01() {
        math(1, 1, (x, y) -> System.out.println(x + y));
        math(1, 1, (x, y) -> System.out.println(x - y));
        math(1, 1, (x, y) -> System.out.println(x * y));
        math(1, 1, (x, y) -> System.out.println(x / y));
    }
}
