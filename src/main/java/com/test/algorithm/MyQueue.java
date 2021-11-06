package com.test.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();

		// add
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");

		// peek
		System.out.println(queue.peek() + " : queue.peek() Retrives but does not remove");
		// Retrieves but does not remove

		// poll
		System.out.println(queue.poll() + " : Retrives and removes the first item in the queue");
		// Retrieves and removes the first item in the queue
	}

}
