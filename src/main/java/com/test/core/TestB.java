package com.test.core;

public class TestB extends TestA {

 public TestB() {
  System.out.println("Test B Sub class");
 }

 public static void main(String[] arg) {
  System.out.println("Test is executing");
  TestB b = new TestB();
  b.test();
 }
}