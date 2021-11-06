package com.test.prob_solving.leetcode;

import java.util.HashMap;

//"D:\DEV\Coding Interview\Leetcode 75 Questions (NeetCode on yt).xlsx"
//https://leetcode.com/list/xi4ci4ig/
// https://www.teamblind.com/post/New-Year-Gift---Curated-List-of-Top-75-LeetCode-Questions-to-Save-Your-Time-OaM1orEU

//https://www.youtube.com/watch?v=KLlXCFG5TnA

//Same sorted case
//https://www.youtube.com/watch?v=cQ1Oz4ckceM

// #sum
// https://www.youtube.com/watch?v=jzZsG8n2R9A
public class Q01_TwoSum {

    public static void main(String[] args) {
        var target = 9;
        int[] nums = {2, 7, 5, 8};
        var ints = twoSum(nums, target);
        System.out.println("" + ints[0] + " " + ints[1]);
        twoSum2(nums, target);
        assert (nums[ints[0]] + nums[ints[1]]) == target;
        target = 9;

        nums = new int[]{2, 11, 7, 15};
        ints = twoSum(nums, target);
        twoSum2(nums, target);
        System.out.println("" + ints[0] + " " + ints[1]);
        assert (nums[ints[0]] + nums[ints[1]]) == target;
    }

    //Brute force solution
    public static int[] twoSum(int[] nums, int target) {
        double sTime = System.nanoTime();
        // target
        // target = num[n1]  + [n2]
        // num[n2] = target - num[n1]

        // approach 1
        //     target - num[n1] -> reminder
        // find the reminder
        //     search for reminder
        int[] pairs = null;
        // 2, 7, 5, 6
        // 9 => 9-2 -> 7 look for 7
        for (int i = 0; i < nums.length; i++) {
            int curr_val = nums[i];
            int targetVal = target - curr_val;
            int targetIndex = 0;
            for (int a = 0; a < nums.length; a++) {
                if (a != i && nums[a] == targetVal) {
                    targetIndex = a;
                    pairs = new int[]{targetIndex, i};
                }
            }
        }
        double time = (System.nanoTime() - sTime);
        System.out.println("Time taken " + time);
        return pairs;
    }

    // Brute force solution - going through each element and finding
    // worst case - n * n --> O(n^2)
    public static int[] twoSum2(int[] nums, int target) {
        int[] var = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int x = 0; x < nums.length; x++) {
                if (i == x) {
                    x++;
                }
                if ((nums[i] + nums[x]) == target) {
                    var[0] = i;
                    var[1] = x;
                    return var;
                }
            }
        }
        return null;
    }

    //O(n) Iterate only 1 time
    //[2, 1, 5, 3] 4 -- {1,3}
    public static int[] twoSum3(int[] nums, int target) {
        // at present point fine the next value u need target-current
        // check if it is available in the map {(key)value, (value)index}
        // if not add the current value with index
        // repeat above, when the map will have

        int[] pair = new int[2];
        HashMap<Integer, Integer> prevValIndex = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            var num = target - nums[i]; // 2| 3| -1| 1
            if (!prevValIndex.containsKey(num)) { //{2,0} | {1,1} | {5,2} | 1 found
                prevValIndex.put(nums[i], i);
            } else {
                pair[0] = prevValIndex.get(num);
                pair[1] = i;
                return pair;
            }
        }
        return null;
    }

    //[2, 1, 5, 3] 4 -- {1,3}
    public static int[] twoSum4(int[] nums, int target) {
        // at present point fine the next value u need target-current
        // check if it is available in the map {(key)value, (value)index}
        // if not add the current value with index
        // repeat above, when the map will have

        int[] pair = new int[2];
        HashMap<Integer, Integer> prevValIndex = new HashMap<>(nums.length);
        prevValIndex.put(nums[0], 0); // {2,0}
        for (int i = 1; i < nums.length; i++) {
            var num = target - nums[i]; // 3| -1| 1
            if (!prevValIndex.containsKey(num)) { // {2,0}| {1,1} | {5,2} | 1 found
                prevValIndex.put(nums[i], i);
            } else {
                pair[0] = prevValIndex.get(num);
                pair[1] = i;
                return pair;
            }
        }
        return null;
    }
}
