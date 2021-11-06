package com.test.prob_solving;

public class ValidParenthesisBalancedString {

    public static void main(String[] args) {
        /*
        20. Valid parentheses [Leet code]
        Given a String s containing just the characters () {} []
        determine the  
         */

        String value = "()(())"; // TRUE
        System.out.println(extracted(value));

        value = "(())(())";  //TRUE  - FAILED!
        System.out.println(extracted(value));

        value = "(())(())";  //TRUE
        System.out.println(extracted(value));
    }

    private static boolean extracted(String value) {
        char[] chars = value.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' && chars[i + 1] == ')') {
                i = i + 2;
            } else {
                int openCount = 0;
                while (chars[i++] == '(') {
                    openCount++;
                }
                int count = 0;
                while (count < openCount) {
                    if (chars[i++] != ')') {
                        return false;
                    }
                    count++;
                }
                return false;
            }
        }
        return true;
    }
}
