package com.test.core;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        SetTest test = new SetTest();
        System.out.println("getUniqueSet = " + test.getUniqueSet());
    }

    Set<String> getUniqueSet() {
        Set<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");
        set1.add("D");
        set1.add("E");

        var set2 = new HashSet<>();
        set2.add("A");
        set2.add("B");
        set2.add("C");

        set1.retainAll(set2);
        return set1;
    }
}
