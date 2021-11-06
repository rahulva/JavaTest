package com.test.prob_solving;

//https://leetcode.com/problems/reverse-integer/

public class ReverseInteger {
    public int reverse(int n) {

        // base of the value is 10
        // so dividing by 10 and get the reminder
        // multiply each reminder by 10 and sum
        long rev = 0; // Long is chosen to avoid avoid situation of running out of integer space
        int reminder = 0;
        while (n != 0) {
            System.out.println("Before remonder : " + reminder + ", rev : " + rev + ", n : " + n);
            // Get the last value/reminder
            reminder = n % 10; // 3, 2, 1 /*What is the reminder if u divide by 10*/
            // calculate the reversed value
            rev = (rev * 10) + reminder; // [0*10+3=3], [3*10+2=32] [32*10+1=321]
            n = n / 10; // 12, 1, 0 /*Do actual division / remove the last number and move to next number to dealt with */
            /* multiply the reversed value by 10 each time there is a reminder and add the reminder*/
            System.out.println("  After remonder : " + reminder + ", rev : " + rev + ", n : " + n);
        }
        System.out.print("Final Value " + rev);

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            rev = 0; // requirement is to return 0 if the value cannot fit in integer
        }
        return (int) rev;
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        var val = 0;
//        val = reverseInteger.reverse(123);
//        assert val == 321 : "Expected value 321";
//        val = reverseInteger.reverse(-123);
//        assert val == -321 : "Expected value -321";
        val = reverseInteger.reverse(1534236469);
        assert val == 0 : "Expected value -321";
    }
}
