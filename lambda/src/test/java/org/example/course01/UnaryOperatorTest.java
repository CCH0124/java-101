package org.example.course01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.function.UnaryOperator;

import org.junit.jupiter.api.Test;

public class UnaryOperatorTest {
    @Test
    public void unaryOperator_test01() {
         UnaryOperator<Integer> func = x -> x * 2;
         assertEquals(8, func.apply(4));
    }

    private static <T> List<T> mathCaculator(List<T> list, UnaryOperator<T> uo) {
        return list.stream().map(x -> uo.apply(x)).toList();
    }
    @Test
    public void unaryOperator_test02() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = mathCaculator(list, x -> x * 2);
        assertEquals(110, result.stream().mapToInt(x -> x).sum());
    }


}
