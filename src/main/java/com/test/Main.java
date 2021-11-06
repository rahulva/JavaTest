package com.test;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		System.out.println(new Main().solution("Forget  CVs..Save time . x x"));
	}

	public int solution(String S) {
		String replace = S.replace(".", ".<SEP>");
		replace = replace.replace("?", "?<SEP>");
		replace = replace.replace("!", "!<SEP>");

		System.out.println("Replace : " + replace);

		String[] split = replace.split("<SEP>");
		int max = 0;
		for (String string : split) {
			System.out.println(string);
			if (string.trim().endsWith(".") || string.trim().endsWith("?") || string.trim().endsWith("?")) {
				String[] split2 = string.replace(".", "").replace("?", "").replace("!", "").trim().split(" ");
				System.out.println(Arrays.asList(split2));
				int length = count(split2);
				System.out.println("Length : " + length);
				if ((length > 1) && max < length) {
					max = length;
				}
				System.out.println("Max : " + max);
			}
		}
		return max;
	}
	
	int count(String[] split2) {
		int i =0;
		for (String string : split2) {
			if(!string.trim().isEmpty())
				i++;
		}
		return i;
	}
	
//	public int solution(String S) {
//		// write your code in Java SE 8
//		String[] split = S.split(".");
//		List<String[]> val = new ArrayList<String[]>();
//		for (String string : split) {
//			val.add(string.split("?"));
//		}
//
//		List<String[]> finalV = new ArrayList<String[]>();
//		for (String[] strings : val) {
//			for (String strings2 : strings) {
//				finalV.add(strings2.split("!"));
//			}
//		}
//
//		List<String[]> finalList = new ArrayList<String[]>();
//		if (!finalV.isEmpty()) {
//			finalList = finalV;
//		} else if (!val.isEmpty()) {
//			finalList = val;
//		} else {
//			finalList.add(split);
//		}
//
//		int max = 0;
//		for (String[] strings : finalV) {
//			for (String strings2 : strings) {
//				int noOfWords = strings2.split(" ").length;
//				if (max < noOfWords) {
//					max = noOfWords;
//				}
//			}
//		}
//		return max;
//	}
}
