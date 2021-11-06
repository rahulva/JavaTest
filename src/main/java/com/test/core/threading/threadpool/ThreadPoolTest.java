package com.test.core.threading.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads

        for (int i = 0; i < 10; i++) { // Started 10 threads one after another
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);//calling execute method of ExecutorService
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }

        System.out.println("Finished all threads");
    }

    public static class WorkerThread implements Runnable {
        private String message;

        public WorkerThread(String s) {
            this.message = s;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
            processmessage();//call processmessage method that sleeps the thread for 2 seconds
            System.out.println(Thread.currentThread().getName() + " (End)");//prints thread name
        }

        private void processmessage() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
