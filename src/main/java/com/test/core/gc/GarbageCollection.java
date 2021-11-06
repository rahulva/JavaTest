package com.test.core.gc;
//https://www.geeksforgeeks.org/garbage-collection-java/
public class GarbageCollection {
    public static void main(String[] args) {
        GarbageCollection t1 = new GarbageCollection();
        GarbageCollection t2 = new GarbageCollection();

        // Nullifying the reference variable
        t1 = null;

        // requesting JVM for running Garbage Collector
        System.gc();

        // Nullifying the reference variable
        t2 = null;

        // requesting JVM for running Garbage Collector
        Runtime.getRuntime().gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector called");
        System.out.println("Object garbage collected : " + this);
    }
}
