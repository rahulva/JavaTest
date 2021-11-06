package com.test.prob_solving;

public class Search2DimentionalArray {
    public static void main(String[] args) {

    }

    private int find2DIndex(int[][] array, int search) {
        for (int rowIndex = 0; rowIndex < array.length; rowIndex++) {
            int[] ints = array[rowIndex];
            for (int columnIndex = 0; columnIndex < array.length; columnIndex++) {
                int anInt = ints[columnIndex];
                if (anInt == search) {
                    return rowIndex;
                }
            }
        }
        return -1;
    }
}
