package com.test.core.java11;

import java.util.Arrays;

public class StringIteration {

    public static void main(String[] args) {
        var value = "ABC";
        Arrays.stream(value.split("")).forEach(System.out::println);

        //Output
        //A
        //B
        //C

        var numString = "102";
        System.out.println(Arrays.stream(numString.split("")).mapToInt(value1 -> (Integer.parseInt(value1) * 2)).sum());
    }

    /*
    More ways here
    https://www.geeksforgeeks.org/iterate-over-the-characters-of-a-string-in-java/
     */
}
