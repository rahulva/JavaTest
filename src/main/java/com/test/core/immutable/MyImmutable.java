package com.test.core.immutable;

//https://www.geeksforgeeks.org/create-immutable-class-java/
// final - sub-class cannot override
// private, final - data members should be private & final (only be assigned at creation time)
public final class MyImmutable {
    private final int value;

    public MyImmutable(int value) {
        this.value = value;
    }
}
