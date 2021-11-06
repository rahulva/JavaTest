package com.test.core.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://mkyong.com/java8/java-8-flatmap-example/
 */

public class FlatMap {
    public static void main(String[] args) {

    }

    public static void test1() {
        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
        Stream<String[]> stream = Stream.of(array);

        List<String> filterA = stream.peek(new Consumer<String[]>() {
            @Override
            public void accept(String[] strings) {
                System.out.println("Consumer 1");
                System.out.println(String.valueOf(strings));
            }
        }).flatMap(Stream::of).peek(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Consumer 2");
                System.out.print(s + ",");
            }
        }).filter(x -> !x.equals("a")).collect(Collectors.toList());
        System.out.println(filterA);
    }

    public static void test2() {
        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        // array to a stream
        Stream<String[]> stream1 = Arrays.stream(array);

        // x is a String[]
        List<String[]> result = stream1
                .filter(x -> {
                    for (String s : x) {      // really?
                        if (s.equals("a")) {
                            return false;
                        }
                    }
                    return true;
                }).collect(Collectors.toList());

        // print array
        result.forEach(x -> System.out.println(Arrays.toString(x)));
    }
}
