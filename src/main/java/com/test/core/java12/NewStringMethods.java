package com.test.core.java12;

public class NewStringMethods {
    public static void main(String[] args) {
        intentMethod();

        transformMethod();
    }

    private static void transformMethod() {
        String text = "Baeldung";
        String transformed = text.transform(value -> new StringBuilder(value).reverse().toString());
        System.out.println(transformed);
    }

    private static void intentMethod() {
        String text = "Hello Baeldung!\nThis is Java 12 article.";

        text = text.indent(4);
        System.out.println(text);

        text = text.indent(-10);
        System.out.println(text);
    }
}
