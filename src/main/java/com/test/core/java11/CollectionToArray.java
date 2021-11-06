package com.test.core.java11;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;

public class CollectionToArray {

    public static void main(String[] args) {
        List<String> sampleList = Arrays.asList("Java", "Kotlin");
        String[] sampleArray = sampleList.toArray(String[]::new);
        Assertions.assertEquals("Java", sampleArray[0]);
        Assertions.assertEquals("Kotlin", sampleArray[1]);
    }
}
