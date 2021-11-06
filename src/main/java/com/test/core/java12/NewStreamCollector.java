package com.test.core.java12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewStreamCollector {
    public static void main(String[] args) {
        double mean = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.teeing(Collectors.summingDouble(i -> i),
                        Collectors.counting(), (sum, count) -> sum / count));
        System.out.println(mean);
        assert (3.0 == mean);
    }
}
