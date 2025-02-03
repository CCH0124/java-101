package org.example.course01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;
import java.util.function.BiFunction;

import org.junit.jupiter.api.Test;

public class BiFunctionTest {
    @Test
    public void biFunction_test01() {
        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 * x2;

        assertEquals(8, func.apply(2, 4));
    }

    @Test
    public void biFunction_test02() {
        BiFunction<Integer, Integer, List<Integer>> func = (x1, x2) -> List.of(x1, x2);

        assertIterableEquals(List.of(2, 4), func.apply(2, 4));
    }

    public record GPS( String Latitude, String Longitude ) {
    }

    public static <R extends GPS> R factory(String Latitude, String Longitude,
                                            BiFunction<String, String, R> func) {
        return func.apply(Latitude, Longitude);
    }

    @Test
    public void newObject_test01() {
        GPS obj = factory("40.741895", "-73.989308", GPS::new);
        assertInstanceOf(GPS.class, obj);
        assertEquals("40.741895", obj.Latitude());
        assertEquals("-73.989308", obj.Longitude());
    }
}
