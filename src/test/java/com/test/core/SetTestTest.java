package com.test.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class SetTestTest {

    private SetTest setTest = new SetTest();

    @Test
    public void setRetainAllTest() {
        var set2 = new HashSet<>();
        set2.add("A");
        set2.add("B");
        set2.add("C");

        Assertions.assertIterableEquals(set2, setTest.getUniqueSet());
    }


}
