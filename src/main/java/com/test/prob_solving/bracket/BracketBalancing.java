package com.test.prob_solving.bracket;

import java.util.ArrayList;
import java.util.List;

public class BracketBalancing {

    public static void main(String[] args) {
        String val = "()";
        int i = maximumLengthOfSubstring(val);

        System.out.println(i + " " + (i == 2));
        val = ")((()))";
        i = maximumLengthOfSubstring(val);
        System.out.println(i + " " + (i == 6));
        val = ")))";
        i = maximumLengthOfSubstring(val);
        System.out.println(i + " " + (i == 0));
    }


    private static int maximumLengthOfSubstring(String value) {
        System.out.println(value);
        int finalVal = 0;
        char[] charValues = value.toCharArray();
        List<Integer> inst = new ArrayList<>();
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
                if (finalVal < (end - start)) {
                    finalVal = (end - start) + 1;
                }
            }
        }
        return finalVal;
    }
}
