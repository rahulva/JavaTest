package com.test.prob_solving.grab_20211011;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class TestGrab20211009_2 {
    public static void main(String[] args) {
        int val = 0;
        for (int i = 0; i < 3; i++) {
            val += i * ((-2) ^ i);
//            System.out.println(i * ((-2) ^ i) + "");
//            String s = convertToNegativeBase2(i);
//            Integer s2 = convertToDecimal(s);
//            System.out.println(s + " "+ s2);

        }
        System.out.println(val + "");

        System.out.println("1" + convertToDecimal(new int[]{0, 1,1,0,0,1,0,1,1,1,0,1,0,1,1}));
        System.out.println("2" + convertToDecimal(new int[]{0, 1,0,1,1,0,0,0,1,0,1,1,1}));
        ;
    }

    public static String convertToNegativeBase2(int dec) {
        double n = (double) dec;
        ArrayList<Integer> a = new ArrayList<>();
        while (n != 0) {
            a.add((int) Math.abs(n % -2));
            n = Math.ceil(n / -2);
        }

        return a.stream().map(Object::toString).collect(Collectors.joining());
    }

    public static int convertToDecimal(String negBase2) {
        int dec = 0;
        for (int i = 0; i < negBase2.length(); i++) {
            dec += Integer.valueOf(String.valueOf(negBase2.charAt(i))) * Math.pow(-2, i);
        }
        return dec;
    }

    public static int convertToDecimal(int[] negBase2) {
        int dec = 0;
        for (int i = 0; i < negBase2.length; i++) {
            dec += negBase2[i] * Math.pow(-2, i);
        }
        return dec;
    }
}
