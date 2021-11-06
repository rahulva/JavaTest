package com.test.prob_solving.find_maxsum_hourglass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayFindThesumOfHourglass {

    public static List<Integer> sumPrint(int[][] arr) {
        List<Integer> finalValues = new ArrayList();
        int sum = 0;
        //Development 1
//        int y = 0;
//        int x = 0;
//        for (int i = 0; i < (arr.length - 3); i++) {
////        while ((x + 3) < arr.length) {
//            System.out.println(i);
//            System.out.println(x);
//            System.out.println(y);
//            int d = 0;
//            sum += arr[x + d][y + 0] + arr[x + d][y + 1] + arr[x + d][y + 2];
//            d = 1;
//            sum += arr[x + d][y + 1];
//            d = 2;
//            sum += arr[x + d][y + 0] + arr[x + d][y + 1] + arr[x + d][y + 2];
//            x++;
//            System.out.println(i);
//            System.out.println(x);
//            System.out.println(y);
//            if (x >= i) {
//                y++;
//                x = 0;
//            }
//        }

        // Develoment 2
        int i = 0;
        int rowStart = 0; //0, 3
        int colStart = 0;
//        System.out.println("iteration " + i);
//        sum = getSum(arr, rowStart, colStart);
//        System.out.println(sum);
//        finalValues.add(sum);
//
//        i = 1;
//        System.out.println("iteration " + i);
//        colStart++;
//
//        sum = getSum(arr, rowStart, colStart);
//        System.out.println(sum);
//        finalValues.add(sum);
//
//        i = 2;
//        System.out.println("iteration " + i);
//        colStart++;
//        sum = getSum(arr, rowStart, colStart);
//        System.out.println(sum);
//        finalValues.add(sum);
//
//        i = 3;
//        System.out.println("iteration " + i);
//        colStart++;
//        sum = getSum(arr, rowStart, colStart);
//        System.out.println(sum);
//        finalValues.add(sum);

        for (colStart = 0; colStart <= arr[0].length - 3; colStart++) {
            System.out.println("iteration row : " + rowStart + " , col : " + colStart);
            sum = getSum(arr, rowStart, colStart);
            System.out.println(sum);
            finalValues.add(sum);
        }

        // moving to next iteration

        i = 0;
        System.out.println("iteration " + i);
        sum = 0;
        if ((rowStart + 3) <= arr.length) { // end of row
            // restart
            rowStart += 1;
        }
//        sum = getSum(arr, rowStart, colStart);
//        System.out.println(sum);
//        finalValues.add(sum);
//
//        colStart++;
//        sum = getSum(arr, rowStart, colStart);
//        System.out.println(sum);
//        finalValues.add(sum);
//
//        colStart++;
//        sum = getSum(arr, rowStart, colStart);
//        System.out.println(sum);
//        finalValues.add(sum);
//
//        colStart++;
//        sum = getSum(arr, rowStart, colStart);
//        System.out.println(sum);
//        finalValues.add(sum);
        for (colStart = 0; colStart <= arr[0].length - 3; colStart++) {
//            System.out.println("iteration " + colStart);
            System.out.println("iteration row : " + rowStart + " , col : " + colStart);
            sum = getSum(arr, rowStart, colStart);
            System.out.println(sum);
            finalValues.add(sum);
        }

        return finalValues;
    }

    public static List<Integer> sumPrint2(int[][] arr) {
        List<Integer> finalValues = new ArrayList();
        int sum = 0;

        int rowStart = 0; //0, 3
        int colStart = 0;

        for (colStart = 0; colStart <= arr[0].length - 3; colStart++) {
            System.out.println("iteration row : " + rowStart + " , col : " + colStart);
            sum = getSum(arr, rowStart, colStart);
            System.out.println(sum);
            finalValues.add(sum);
        }

        // moving to next iteration

        if ((rowStart + 3) <= arr.length) { // end of row
            // restart
            rowStart += 1;
        }
        for (colStart = 0; colStart <= arr[0].length - 3; colStart++) {
            System.out.println("iteration row : " + rowStart + " , col : " + colStart);
            sum = getSum(arr, rowStart, colStart);
            System.out.println(sum);
            finalValues.add(sum);
        }

        return finalValues;
    }

    public static List<Integer> sumPrint3(int[][] arr) {
        List<Integer> finalValues = new ArrayList();
        int sum = 0;

        for (int rowStart = 0; (rowStart + 3) <= arr.length; rowStart++) {
            for (int colStart = 0; colStart <= arr[0].length - 3; colStart++) {
                System.out.println("iteration row : " + rowStart + " , col : " + colStart);
                sum = getSum(arr, rowStart, colStart);
                System.out.println(sum);
                finalValues.add(sum);
            }
        }

        return finalValues;
    }

    private static int getSum(int[][] arr, int rowStart, int colStart) {
        int sum = 0;
        for (int x = rowStart; x < (rowStart + 3); x++) {
            for (int y = colStart; y < (colStart + 3); y++) {
                if (!(x == (rowStart + 1) && (y == colStart || y == ((colStart + 3) - 1)))) {
                    sum += arr[x][y];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}};
        //int[][] arr = new int[16][16];
        List<Integer> integers = sumPrint3(arr);
        System.out.println(integers);
        System.out.println("-63, -34, -9, 12, " +
                "-10,   0, 28, 23, " +
                "-27, -11, -2, 10, " +
                "  9,  17, 25, 18");
        assert integers.get(0) == -63;
        assert integers.get(1) == -34;
        assert integers.get(2) == -9;
        assert integers.get(3) == 12;
        //------
        assert integers.get(4) == -10;
        assert integers.get(5) == 0;
        assert integers.get(6) == 28 : "6th element is not 28";
        assert integers.get(7) == 23 : "7th element is not 23";
        //-----
        assert integers.get(8) == -27 : "8th element is not -27";
        assert integers.get(9) == -11 : "8th element is not -11";
        assert integers.get(10) == -2 : "8th element is not -2";
        assert integers.get(11) == 10 : "8th element is not 10";
        //-----
        assert integers.get(12) == 9 : "8th element is not 9";
        assert integers.get(13) == 17 : "8th element is not -17";
        assert integers.get(14) == 25 : "8th element is not 25";
        assert integers.get(15) == 18 : "8th element is not 18";
        Integer integer = integers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Success");
    }
}
