package com.test.prob_solving.grab_20211011;

import java.util.ArrayList;
import java.util.Arrays;

public class TestGrab20211009_3 {
    public static void main(String[] args) {
        int val = 0;
//        for (int i = 0; i < 3; i++) {
//            val += i * ((-2) ^ i);
//            System.out.println(i * ((-2) ^ i) + "");
//            String s = convertToNegativeBase2(i);
//            Integer s2 = convertToDecimal(s);
//            System.out.println(s + " " + s2);

//        }
//        System.out.println(val + "");

        int[] negBase2 = {0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1};
        System.out.println("1" + convertToDecimal(negBase2));
        int[] negBase21 = {0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1};
        System.out.println("2" + convertToDecimal(negBase21));

        int[] solution = new Solution().solution(negBase2, negBase21);
        Arrays.stream(solution).forEach(System.out::print);
        System.out.println();
        System.out.println(convertToDecimal(solution));

//        https://github.com/hishamjaved/coding-exercises/blob/master/src/main/java/com/codility/BaseNegative2.java
    }

    static class  Solution {
        public int[] solution(int[] A, int[] B) {
            int xVal = convertToDecimal(A);
            int yVal = convertToDecimal(B);
            return convertToNegativeBase2(xVal + yVal);
        }
    }

    public static int convertToDecimal(int[] negBase2) {
        int dec = 0;
        for (int i = 0; i < negBase2.length; i++) {
            dec += negBase2[i] * Math.pow(-2, i);
        }
        return dec;
    }

    public static int[] convertToNegativeBase2(int dec) {
        double n = (double) dec;
        ArrayList<Integer> a = new ArrayList<>();
        while (n != 0) {
            a.add((int) Math.abs(n % -2));
            n = Math.ceil(n / -2);
        }
        int length = a.size();
        int intArray[] = new int[length];
        for (int i = 0; i < length; i++) {
            intArray[i] = (int) a.get(i);
        }
        return intArray;
    }
}
