package com.test.core.threading;

public class SimpleThread {
    public static void main(String[] args) {
        System.out.println("1 " + Thread.currentThread());
        Thread t = new Thread("MyThread") {
            @Override
            public void run() {
                System.out.println("2 " + Thread.currentThread());
                System.out.println("Thread Executing");
            }
        };
        System.out.println("3 " + Thread.currentThread());
        t.start();
        System.out.println("4 " + Thread.currentThread());
    }
}
