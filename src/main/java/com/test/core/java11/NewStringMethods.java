package com.test.core.java11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NewStringMethods {

    @Test
    public void testBlankLinesStripe() {
        String multilineString = "Baeldung helps \n \n developers \n explore Java.";

        List<String> lines = multilineString.lines()
                // .filter(line -> !line.isBlank())     // prior to java 11
                .filter(Predicate.not(String::isBlank)) // Predicate.not() is a java 11 feature
                .map(String::strip)
                .collect(Collectors.toList());

        Assertions.assertLinesMatch(Arrays.asList("Baeldung helps", "developers", "explore Java."), lines);
    }

    @Test
    public void stringConcatenate() {
        String[] strings = {"I'm", "running", "out", "of", "pangrams!"};

        String myString = String.join(" ", strings);

        Assertions.assertEquals("I'm running out of pangrams!", myString);
    }

    @Test
    public void concatenateUsingStringJoiner() {
        StringJoiner fruitJoiner = new StringJoiner(", ");

        fruitJoiner.add("Apples");
        fruitJoiner.add("Oranges");
        fruitJoiner.add("Bananas");
        Assertions.assertEquals("Apples, Oranges, Bananas", fruitJoiner.toString());
    }
}
