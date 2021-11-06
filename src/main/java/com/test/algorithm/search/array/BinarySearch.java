package com.test.algorithm.search.array;

/**
 * Array must be sorted
 * Idea : find the mid point (by dividing the length)
 * check if found
 * Else move to left or right depending on the value (small or big)
 * limit the range accordingly
 *
 * binary - not all element are read
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        extracted(array, 6);
        extracted(array, 2);
        extracted(array, 1);
    }

    private static void extracted(int[] array, int find) {
        int left = 0, right = array.length;         // start with full array - left=0, right=7

        while (left <= right) {                     // exit until ran out of elements 0<7 | left=4, right=7

            int midReminder = (right - left) / 2;   // Find the mid point 7/2=3 | 7-4/2=1
            int mid = left + midReminder;           // 0+3=3 | 4+1=5

            System.out.println("Mid : " + mid);
            if (array[mid] == find) {               // if found terminate 4!=6

                System.out.println("Found : " + mid);// FOUND
                break;

                // decide which side to move
            } else if (find > array[mid]) {         // 6>4
                left = mid + 1;                     // if the value(find) is big - move right side
                right = array.length;
            } else if (find < array[mid]) {         //  6!=4
                left = 0;
                right = mid - 1;                    // if the value is small - move to left side
            }
        }
    }

}
