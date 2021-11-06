package com.test.core.threading.threadpool;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.concurrent.*;

public class TestFixedThreadPool {

    @Test
    public void main() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<String> s1 = executorService.submit(new CallableObject("S1"));
        Future<String> s2 = executorService.submit(new CallableObject("S2"));
        Future<String> s3 = executorService.submit(new CallableObject("S3"));
        System.out.println("execution");

        ThreadPoolExecutor executor = ((ThreadPoolExecutor) executorService);

        Assertions.assertEquals(2, executor.getPoolSize());
        Assertions.assertEquals(1, executor.getQueue().size());  // 3rd submit waiting to complete

        Assertions.assertEquals("S3", s3.get()); //  force execution
        Assertions.assertEquals(0, executor.getQueue().size());  // 3rd item completed
    }

    @Test
    public void case2() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        List<CallableObject> list = new ArrayList<>();
        list.add(new CallableObject("S1"));
        list.add(new CallableObject("S2"));
        list.add(new CallableObject("S3"));
        List<Future<String>> futures = executorService.invokeAll(list); // force invokes all item.

        ThreadPoolExecutor executor = ((ThreadPoolExecutor) executorService);
        Assertions.assertEquals(2, executor.getPoolSize());
        Assertions.assertEquals(0, executor.getQueue().size());
        System.out.println("execution");
    }

    @Test
    public void case3() throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        List<CallableObject> list = new ArrayList<>();
        list.add(new CallableObject("S1"));
        list.add(new CallableObject("S2"));
        list.add(new CallableObject("S3"));
//        List<Future<String>> futures = executorService.invokeAll(list);

        String s = executorService.invokeAny(list);

        ThreadPoolExecutor executor = ((ThreadPoolExecutor) executorService);
        Assertions.assertEquals(2, executor.getPoolSize());
        Assertions.assertEquals(0, executor.getQueue().size());
        System.out.println("execution");
    }

    private class CallableObject implements Callable<String> {
        private String string;

        public CallableObject(String string) {
            this.string = string;
        }

        @Override
        public String call() throws Exception {
            System.out.println(string + " Start");

            Thread thread = Thread.currentThread();
            System.out.println("" + thread.getName() + " " + thread.getId() + " " + thread.getThreadGroup().getName());
            Thread.sleep(1000);
            return string;
        }
    }
}
