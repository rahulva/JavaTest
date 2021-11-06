package com.test.core.comparator_comparable;

import java.util.Comparator;

public class CompareAbleVsAtor {

	Comparator<CompareAbleVsAtor> a = new Comparator<CompareAbleVsAtor>() {

		@Override
		public int compare(CompareAbleVsAtor o1, CompareAbleVsAtor o2) {
			// Comparing two objects of same type.
			// Externalized form of comparable
			return 0;
		}

	};

	Comparable<CompareAbleVsAtor> b = new Comparable<CompareAbleVsAtor>() {
		// marks the type comparable
		// hence the current object (this) is comparable by another object
		public int compareTo(CompareAbleVsAtor o) {
			return 0;

		};
	};

	public static void main(String[] args) {

		int size = 1;
		while (size <= 100) {
			int index = (size & 0x7FFFFFFF) % 10;
			System.out.println(index);
			size++;
		}
	}
}
