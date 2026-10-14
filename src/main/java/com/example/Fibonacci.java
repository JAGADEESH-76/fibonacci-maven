
package com.example;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static List<Integer> generate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                "Number of terms cannot be negative"
            );
        }

        List<Integer> series = new ArrayList<>();
        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {
            series.add(first);

            int next = first + second;
            first = second;
            second = next;
        }

        return series;
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println(
            "Fibonacci Series: " + generate(n)
        );
    }
}
