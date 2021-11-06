package com.test.algorithm.search;

import java.util.Scanner;

public class QuickFindUF {

	private int[] id;

	public QuickFindUF(int n) {
		id = new int[n];
		for (int i = 0; i < n; i++) {
			id[i] = i;
		}
	}

	public void union(int p, int q) {
		int pId = id[p];
		int qId = id[q];
		for (int i = 0; i < id.length; i++) {
			if (id[i] == pId) {
				id[i] = qId;
			}
		}
	}

	public boolean isConnected(int p, int q) {
		return id[p] == id[q];
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

		QuickFindUF unionFind = new QuickFindUF(val);

	}
}
