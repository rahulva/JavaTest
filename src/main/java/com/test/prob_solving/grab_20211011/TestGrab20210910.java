package com.test.prob_solving.grab_20211011;

public class TestGrab20210910 {
    public static void main(String[] args) {
///       https://www.glassdoor.sg/Interview/There-are-N-people-numbered-from-0-to-N-1-playing-a-game-The-K-th-person-is-assigned-the-letter-S-K-At-the-beginnin-QTN_4332805.htm
        new Solution().solution("CODE", new int[]{3, 2, 0, 1});
    }
}

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public String solution(String S, int[] A) {
        // write your code in Java SE 8
        char[] chars = S.toCharArray();
        String finalmsg = String.valueOf(chars[0]);
        int dist = A[0];
        System.out.println("F : final msg : " + finalmsg + " dist : " + dist);
        while (dist != 0) {
            System.out.println("final msg : " + finalmsg + " dist : " + dist);
            finalmsg += chars[dist];
            dist = A[dist];

        }
        System.out.println("L : final msg : " + finalmsg + " dist : " + dist);
        return finalmsg;
    }
}

