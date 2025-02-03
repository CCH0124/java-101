package org.example.course01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Consumer;

import org.junit.jupiter.api.Test;

public class ConsumerTest {
    @Test
    public void consumer_test01() {
        Product coffee = new Product("coffee", 80.0);
        Consumer<Product> update = p -> p.price *= 0.8;
        update.accept(coffee);

        assertEquals(64.0, coffee.price);
    }

}

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}