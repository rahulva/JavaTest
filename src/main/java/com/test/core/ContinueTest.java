package com.test.core;

public class ContinueTest {
    public static void main(String[] args) {
        continueTest();
    }

    private static void continueTest() {
//        for (int x = 0; x < 10; x++) {
//            System.out.println("x " + x);
            for (int y = 0; y < 10; y++) {
                if (y == 5) {
                    continue;  // skips the 5 and continues to 6
                }
                System.out.print("y " + y + ", ");
            }
//        }
    }
}
