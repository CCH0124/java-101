package org.example.course01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.function.Function;

import org.junit.jupiter.api.Test;

public class FunctionTest {
    @Test
    public void function_test01() {
        Function<String, Integer> func = x -> x.length();

        assertEquals(6, func.apply("itachi"));
    }

    @Test
    public void function_chain_test01() {
        Function<Integer, Integer> func = x -> x * x;

        Function<Integer, Integer> func2 = x -> x * 2;

        assertEquals(8, func.andThen(func2).apply(2));
        assertNotEquals(16, func.andThen(func2).apply(2));
    }

    @Test
    public void hash_test() throws NoSuchAlgorithmException {
        var digest = MessageDigest.getInstance("SHA-256");
        List<String> of = List.of("node", "c++", "java", "javascript");
        var list = hashMapping(
            of , 
            x -> digest.digest(x.getBytes(StandardCharsets.UTF_8))
        );
        assertEquals(of.size(), list.size());
    }   

    private <T, R> List<R> hashMapping(List<T> list, Function<T, R> func) {
        return list.stream().parallel().map(x -> func.apply(x)).toList();
    }

}
