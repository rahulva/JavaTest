package com.test.prob_solving;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] pair = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int x = 0; x < nums.length; x++) {
                if (x == i) {
                    x++;
                }
                if ((nums[i] + nums[x]) == target) {
                    pair[0] = i;
                    pair[1] = x;
                    return pair;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSum val = new TwoSum();
        int[] ints = null;

        int[] nums = {2, 7, 11, 15};
        var target = 9;

        ints = val.twoSum(nums, target);
        assert ((ints[0] + ints[1]) == target);
    }
}

/*
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] pair = new int[2];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < target) {
                int targetReminder =  target - nums[i];

                for(int x = 0; x < nums.length; x++) {
                    if((x != i) && (nums[x] == targetReminder)) {
                        pair[0] = i;
                        pair[1] = x;
                        return pair;
                    }
                }
            } else {
                i++;
            }
        }
        return null;
    }
}
*/
