package com.test.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class MyStacks {

	public static void main(String[] args) {

		System.out.println("------------------------Stack--------------------------------");
		Stack<String> stack = new Stack<>();

		// Last In First out

		// Push In the items
		stack.add("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");

		// Retrieves the item without removing it
		System.out.println(stack.peek());

		// Removes the last item
		System.out.println("pop()");
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.out.println("------------------------Linked List Stack--------------------------------");

		LinkedListStack<String> inkedstack = new MyStacks().new LinkedListStack<>();

		// Push In the items
		inkedstack.push("A");
		inkedstack.push("B");
		inkedstack.push("C");
		inkedstack.push("D");

		// Retrieves the item without removing it
		System.out.println("peek");
		System.out.println(inkedstack.peek());

		// Removes the last item
		System.out.println("pop");
		System.out.println(inkedstack.pop());
		System.out.println(inkedstack.pop());

		System.out.println("------------------------Array List Stack--------------------------------");

		ArrayListStack<String> arrayListStack = new MyStacks().new ArrayListStack<>();

		// Push In the items
		arrayListStack.push("A");
		arrayListStack.push("B");
		arrayListStack.push("C");
		arrayListStack.push("D");

		// Removes the last item
		System.out.println("pop");
		System.out.println(arrayListStack.pop());
		System.out.println(arrayListStack.pop());

		System.out.println("------------------------Array Stack--------------------------------");

		ArrayStack<String> arrayStack = new MyStacks().new ArrayStack<>();

		// Push In the items
		arrayStack.push("A");
		arrayStack.push("B");
		arrayStack.push("C");
		arrayStack.push("D");

		// Removes the last item
		System.out.println("pop");
		System.out.println(arrayStack.pop());

		System.out.println(arrayStack.pop());
	}

	class LinkedListStack<E> extends LinkedList<E> {

		private static final long serialVersionUID = -1479989794287254331L;

		public void push(E e) {
			add(e);
		}

		public E pop() {
			// poll()
			E e = get(size() - 1);
			removeLast();
			return e;
		}
	}

	class ArrayListStack<E> extends ArrayList<E> {

		private static final long serialVersionUID = 8679756189760675364L;

		public void push(E e) {
			add(e);
		}

		public E pop() {
			// poll()
			int lItem = size() - 1;
			E e = get(lItem);
			remove(lItem);
			return e;
		}
	}

	class ArrayStack<E> implements Iterable<E> {

		private int size = 0;
		private static final int CAPACITY = 16;
		private Object[] elements;

		public ArrayStack() {
			elements = new Object[CAPACITY];
		}

		public void push(E e) {
			if (size == CAPACITY) {
				cpacityIncrease();
			}
			elements[size] = e;
			size++;
		}

		public E pop() {
			// poll()
			size--;
			@SuppressWarnings("unchecked")
			E e = (E) elements[size];
			elements[size] = null;
			return e;
		}

		private void cpacityIncrease() {
			elements = Arrays.copyOf(elements, CAPACITY * 2);
		}

		@Override
		public Iterator<E> iterator() {
			return new Iterator<E>() {

				@Override
				public boolean hasNext() {
					return false;
				}

				@Override
				public E next() {
					// TODO Auto-generated method stub
					return null;
				}
			};
		}

	}
}
