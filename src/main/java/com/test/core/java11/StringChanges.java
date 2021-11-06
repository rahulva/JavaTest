package com.test.core.java11;

public class StringChanges {
    public static void main(String[] args) {
        String value = "Value";
        System.out.println("isBlank - " + value.isBlank());

        System.out.println("value.lines");
        System.out.println(value.lines().count()); // streams of lines
        String multiLine = "Line 1 \n line 2";
        System.out.println(multiLine.lines().count());

        value = " Value ";
        System.out.println("stripe - \'" + value + "\' " + value.strip());
    }
}
