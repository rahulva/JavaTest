package com.test.prob_solving.find_maxsum_hourglass;

public class Arra {
    public static void main(String[] args) {
        String[][] arr = {
                {"A-x0y0", "B-x0y1", "C-x0y2"},
                {"A-10", "B-11"}};
        //first no defines the row Y
        //2nd one define the column X
        System.out.println(arr[0][0]); // row 1, col 1
        System.out.println(arr[0][1]); // row 1, col 2
        System.out.println(arr[0][2]); // row 1, col 3
        System.out.println(arr[1][0]); // row 2, col 1
        System.out.println(arr[1][1]); // row 2, col 1
//        System.out.println(arr[1][0]);
//        System.out.println(arr[1][1]);
    }
}
