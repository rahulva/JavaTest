package com.test.core.threading.threadpool;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class WorkStealingOrForkJoinPoolTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newWorkStealingPool();
        java.util.concurrent.ForkJoinPool forkJoinPool = (java.util.concurrent.ForkJoinPool) executorService;
//        forkJoinPool.
    }

    @Test
    public void case2() throws InterruptedException {
        ExecutorService executorService = Executors.newWorkStealingPool();

        System.out.println(Runtime.getRuntime().availableProcessors());

        List<CallableObject> list = new ArrayList<>();
        list.add(new CallableObject("S1"));
        list.add(new CallableObject("S2"));
        list.add(new CallableObject("S3"));
        List<Future<String>> futures = executorService.invokeAll(list); // force invokes all item.

        ForkJoinPool executor = ((ForkJoinPool) executorService);
        Assertions.assertEquals(3, executor.getPoolSize());
        System.out.println("getActiveThreadCount =" + executor.getActiveThreadCount());
        System.out.println("getParallelism =" + executor.getParallelism());
        System.out.println("getQueuedSubmissionCount =" + executor.getQueuedSubmissionCount());
        System.out.println("getQueuedTaskCount =" + executor.getQueuedTaskCount());
        System.out.println("getRunningThreadCount =" + executor.getRunningThreadCount());
        System.out.println("getStealCount =" + executor.getStealCount());
        System.out.println("getAsyncMode =" + executor.getAsyncMode());

//        Assertions.assertEquals(0, executor.getQueue().size());
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
