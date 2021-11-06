package com.test.prob_solving.amazon;

/**
 * 1. Amazon Prime Music Time :- You’re a given List of N songs (0 to N-1).
 * You have to select exactly one pair of songs (both songs should be different) such that they end 30 seconds before the given time limit,
 * If multiple pairs are possible, then return the one which has the largest duration of the song.
 * If two pairs have the same largest duration song,
 * then return one which comes first. You have to return indexes of those pairs. If No such pair exists, then return <-1,-1>
 */

/**
 * Sample input:    time limit = 90
 * songs_duration = [1, 10, 25, 35, 60]
 * Sample  Output: [2, 3]
 * <p>
 * As we can see, songs with index  2(25) and 3(35) have a total duration of 60, 30 seconds less than 90.
 */

public class AmazonQ1 {
    public static void main(String[] args) {
        AmazonQ1 amazonQ1 = new AmazonQ1();
        int[] durations = {1, 10, 25, 35, 60};
        int timeLimit = 90;
        int[] theDurationsWithInTheGive = amazonQ1.findTheDurationsWithInTheGive(timeLimit, durations);
    }

    // Q -

    public int[] findTheDurationsWithInTheGive(int timeLimit, int[] durations) {
        for (int i = 0; i < (durations.length - 1); i++) {
            int[] ints = new int[]{0, 0};
            int totalPairTime = durations[i] + durations[(i + 1)];
            if (totalPairTime <= (timeLimit - 30)) {
                if (totalPairTime > (ints[0] + ints[1])) {
                    ints = new int[]{i, (i + 1)};
                }
            }
            return ints;
        }
        return new int[]{-1, -1};
    }
}
