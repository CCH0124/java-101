package org.example.course01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.function.BinaryOperator;

import org.junit.jupiter.api.Test;

public class BinaryOperatorTest {
    @Test
    public void binaryOperator_test01() {
        BinaryOperator<Integer> func = (x1, x2) -> x1 + x2;
        assertEquals(5, func.apply(2, 3));
    }

    public record Product(String name, double price) {
    }

    public static <T> T productCaculator(List<T> list, T init, BinaryOperator<T> accumulator) {
        return list.stream().reduce(init, accumulator);
    }

    @Test
    public void binaryOperator_test02() {
        List<Product> productList = List.of(
                new Product("Laptop", 1000.00),
                new Product("Monitor", 300.00),
                new Product("Keyboard", 100.00),
                new Product("Mouse", 50.00));
        
        var total = productCaculator(productList.stream().map(Product::price).toList(), 0.0, Double::sum);

        assertEquals(1450.00, total);
    }
}
