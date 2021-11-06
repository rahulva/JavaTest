package com.test.interview.shopee;

import java.util.*;

class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Click HELP above to see examples of handling input/debug/output
		// INPUT: int n = in.nextInt();
		// DEBUG: System.out.println(n);
		// OUTPUT: System.out.println(result);

		List<Integer> val = new ArrayList<Integer>();

		String input = "[[1:4],[4:5]]";// in.next();
		String[] split = input.substring(1, input.length() - 1).split(",");
		for (String string : split) {
			Integer.parseInt(String.valueOf(string.charAt(1)));
			extracted(val, Integer.parseInt(String.valueOf(string.charAt(3))));
		}

//		while (in.hasNext()) {
//			Integer n = Integer.parseInt(in.next());
//		System.out.println(n);

//		}
		String result = "";
		if (val.size() > 1) {
			for (int i = 0; i < val.size(); i++) {
				result += "[" + val.get(i) + ":" + val.get(++i) + "]";
			}
		}
		System.out.println("[" + result + "]");

		// Write the code to solve the problem below,
		// format the "result" as specified in the problem statement
		// and finally, write the result to stdout
		// IMPORTANT: Remove all debug statements for final submission

	}

	private static void extracted(List<Integer> val, Integer n) {
		if (val.size() < 1) {
			val.add(n);
		} else {
			Integer lastEliment = val.get((val.size() - 1));

			Integer lastElimentOneBefore = null;
			if (val.size() == 1) {
				lastElimentOneBefore = val.get((val.size() - 1));
			} else {
				val.get((val.size() - 2));
			}

			if (!between(n, lastElimentOneBefore, lastEliment)) {
				val.add(n);
			}
		}
	}

	public static boolean between(int i, int minValueInclusive, int maxValueInclusive) {
		if (i >= minValueInclusive && i <= maxValueInclusive)
			return true;
		else
			return false;
	}

}