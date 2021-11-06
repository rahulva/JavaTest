package com.test.core.threading.fork_join_pool;

public class CustomRecursiveTaskTest {
    public static void main(String[] args) {
        CustomRecursiveTask task = new CustomRecursiveTask(new int[]{});
        task.compute();
        new CustomRecursiveTask(null).compute();
    }
}
