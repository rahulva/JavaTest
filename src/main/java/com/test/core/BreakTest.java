package com.test.core;

public class BreakTest {
    public static void main(String[] args) {
        breakTest();
    }

    private static void breakTest() {
//        for (int x = 0; x < 10; x++) {
//            System.out.println("x " + x);
            for (int y = 0; y < 10; y++) {
                if (y == 5) {
                    break; // breaks the 5
                }
                System.out.print("y " + y + ", ");
            }
//        }
    }
}
