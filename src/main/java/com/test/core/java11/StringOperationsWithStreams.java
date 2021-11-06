package com.test.core.java11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringOperationsWithStreams {
    public static void main(String[] args) {
//        https://www.baeldung.com/java-stream-operations-on-strings

        System.out.println(join(new String[]{"ABC", "XYZ"}));

        System.out.println(joinWithPrefixPostfix(new String[]{"ABC", "XYZ"}));
    }

    public static String join(String[] arrayOfString) {
        return Arrays.asList(arrayOfString)
                .stream()
                //.map(...)
                .collect(Collectors.joining(", "));
    }



    public static String joinWithPrefixPostfix(String[] arrayOfString) {
        return Arrays.asList(arrayOfString)
                .stream()
                //.map(...)
                .collect(Collectors.joining(",", "[", "]"));
    }

    public static List<String> split(String str) {
        return Stream.of(str.split(","))
                .map(String::new) // equivalant to elem -> new String(elem)
                .collect(Collectors.toList());
    }

    public static List<Character> splitToListOfChar(String str) {
        return str.chars()
                .mapToObj(item -> (char) item)
                .collect(Collectors.toList());
    }

    public static Map<String, String> arrayToMap(String[] arrayOfString) {
        return Arrays.asList(arrayOfString)
                .stream()
                .map(str -> str.split(":"))
                .collect(Collectors.toMap(str -> str[0], str -> str[1]));
    }


}
