package com.test.core.threading.fork_join_pool;

public class CustomRecursiveActionTest {
    public static void main(String[] args) {
//        CustomRecursiveAction action = new CustomRecursiveAction("1234567812345678");
//        action.compute();

        CustomRecursiveAction action2 = new CustomRecursiveAction("123|567|123|5|78|");
        action2.compute();
    }
}
