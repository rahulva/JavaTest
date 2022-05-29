package com.test.core;

import java.util.stream.Stream;

public class StreamConcat {

    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("A", "B", "C", "D");
        Stream<String> stream2 = Stream.of("A", "B", "C");
        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach(System.out::println);
    }
}
