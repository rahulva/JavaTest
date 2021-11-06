package com.test.prob_solving.find_maxsum_hourglass;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

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

    public static List<Integer> sumPrint3(int[][] arr) {
        List<Integer> finalValues = new ArrayList();
        int sum = 0;

        for (int rowStart = 0; (rowStart + 3) <= arr.length; rowStart++) {
            for (int colStart = 0; colStart <= arr[0].length - 3; colStart++) {
                sum = getSum(arr, rowStart, colStart);
                finalValues.add(sum);
            }
        }

        return finalValues;
    }

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        List<Integer> integers = sumPrint3(arr);
        return integers.stream().max(Comparator.naturalOrder()).get();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
