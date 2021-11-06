package com.test.prob_solving.bracket;

// Print start and end indexes of a balanced substring

public class BalancedSubStringPrint {
    public static void main(String... arg) {
        String value = "()";
        printBalanceFound(value);

        value = "(()))";
        printBalanceFound(value);

        value = "()(())";
        printBalanceFound(value);
    }

    private static void printBalanceFound(String value) {
        System.out.println(value);
        char[] charValues = value.toCharArray();

        for (int i = 0; i < charValues.length; i++) {
            if (charValues[i] == '(' && charValues[i + 1] == ')') {
                int start = i, end = i + 1;
                if (start > 0) {
                    while (charValues[start] == '(' && charValues[end] == ')') {
                        start--;
                        end++;
                        if (start < 1 || end == (charValues.length - 1)) {
                            break;
                        }
                    }
                }
                System.out.println("found" + start + "," + end);
            }
        }
    }
}