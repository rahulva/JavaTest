package com.test.algorithm.search;

import java.util.Scanner;

public class QuickUnionUF {

	private int[] id;

	public QuickUnionUF(int n) {
		id = new int[n];
		for (int i = 0; i < n; i++) {
			id[i] = i;
		}
	}

	private int root(final int i) {
		int x = i;
		while (x != id[x]) {
			x = id[x];
		}
		return x;
	}

	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		id[i] = j;
	}

	public int find(int p) {
		return 0;
	}

	public int count() {
		return 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Input : ");
		int val = scanner.nextInt();

		QuickUnionUF unionFind = new QuickUnionUF(val);

	}
}
