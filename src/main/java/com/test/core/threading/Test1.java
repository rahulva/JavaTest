package com.test.core.threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Test1 {
	public static void main(String[] args) {
		// t1_simpleJavaThread();
		// t2_theradExecutionWithSleep();
		// t3_executorServiceAndSubmit();
		// t4_executorServiceShutdown();
		// t5_executorServiceCallable();

	}

	public static void t1_simpleJavaThread() {
		Runnable target = () -> System.out.println("Hello " + Thread.currentThread().getName());
		Thread runner = new Thread(target);
		target.run(); // Manuall Execution// Will be part of main thread flow
		runner.start(); // Starting as a new thread
		System.out.println("Done!");
	}

	public static void t2_theradExecutionWithSleep() {
		Runnable runnable = () -> {
			try {
				String name = Thread.currentThread().getName();
				System.out.println("Foo : " + name);
				TimeUnit.MILLISECONDS.sleep(1);
				System.out.println("Bar : " + name);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		new Thread(runnable).start();
	}

	// ExecutorService, Runnable, submit
	public static void t3_executorServiceAndSubmit() {
		ExecutorService executorSvc = Executors.newSingleThreadExecutor();
		executorSvc.submit(() -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Hello " + threadName);
		});
	}

	// ExecutorService, Runnable, submit, shutdown, shutdowbNow
	public static void t4_executorServiceShutdown() {
		ExecutorService executorSvc = Executors.newSingleThreadExecutor();
		Runnable task = () -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Hello " + threadName);
		};
		executorSvc.submit(task);
		try {
			System.out.println("attempt to shutdown executor");
			executorSvc.shutdown();
			executorSvc.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.err.println("tasks interrupted");
		} finally {
			if (!executorSvc.isTerminated()) {
				System.err.println("cancel non-finished tasks");
			}
			executorSvc.shutdownNow();
			System.out.println("shutdown finished");
		}
	}

	// ExecutorService, Callable, submit, get
	public static void t5_executorServiceCallable() {
		Callable<Integer> task = () -> {
			try {
				TimeUnit.SECONDS.sleep(1);
				return 123;
			} catch (InterruptedException e) {
				throw new IllegalArgumentException("task interrupted", e);
			}
		};

		ExecutorService executor = Executors.newFixedThreadPool(1);
		Future<Integer> future = executor.submit(task);

		try {
			System.out.println("future done? " + future.isDone());
			Integer result = future.get();

			System.out.println("future done? " + future.isDone());
			System.out.print("result: " + result);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
