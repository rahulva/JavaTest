package com.test.core.orverloading;

import java.util.logging.Logger;

public class StaticOverloading {

    public static void calculate(double t) {
        System.out.println("double");
    }

    public static void calculate(int t) {
        System.out.println("Int");
    }

    public static void main(String[] args) {
        StaticOverloading.calculate(10);
        StaticOverloading.calculate(10.1);
    }
}
