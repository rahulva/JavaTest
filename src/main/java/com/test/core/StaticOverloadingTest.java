package com.test.core;

public class StaticOverloadingTest {
 public static void test(int x, int y) {
  System.out.println("test int x, int y");
 }

 public static void test(long x, long y) {
  System.out.println("test long x, long y");
 }

 public static void main(String[] args) {
  StaticOverloadingTest.test(10, 10);
  StaticOverloadingTest.test(10L, 10L);
  System.out.println("It is possilbe to overload static methods !!!");
 }

}