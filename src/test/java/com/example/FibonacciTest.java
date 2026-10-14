
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class FibonacciTest {

    @Test
    void testFirstTenTerms() {
        List<Integer> expected = Arrays.asList(
            0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        );

        assertEquals(expected, Fibonacci.generate(10));
    }

    @Test
    void testZeroTerms() {
        assertEquals(
            Collections.emptyList(),
            Fibonacci.generate(0)
        );
    }

    @Test
    void testOneTerm() {
        assertEquals(
            Collections.singletonList(0),
            Fibonacci.generate(1)
        );
    }

    @Test
    void testNegativeTerms() {
        assertThrows(
            IllegalArgumentException.class,
            () -> Fibonacci.generate(-1)
        );
    }
}
