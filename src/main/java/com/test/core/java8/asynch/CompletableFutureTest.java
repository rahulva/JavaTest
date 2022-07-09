package com.test.core.java8.asynch;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureTest {
    public static void main(String[] args) {
    }

    void processOrder() {
        // CPU bound operations
        ExecutorService cpuBound = Executors.newFixedThreadPool(4); //eg :having only 4 cpu cores
        // IO bound operations
        ExecutorService ioBound = Executors.newCachedThreadPool();


        CompletableFuture.supplyAsync(() -> getOrder(), ioBound) // new order creation is IO bound
                .thenApplyAsync(order -> enrich(order), cpuBound)  // eniching order is CPU bound
                .thenApply(order -> dispatch(order))
                .thenAccept(order -> sendEmail(order)); // Consumer > doesn't return a value

        //thenApply - continutes the execution in SAME THREAD (created by supplyAsynch)
        //thenApplyAsync - will continue the execution in NEW THREAD

        CompletableFuture.supplyAsync(() -> getOrder()) // Starts the execution in new thread
                .thenApplyAsync(order -> enrich(order))  // Supplyer > returns a value //
                .thenApply(order -> dispatch(order))
                .thenAccept(order -> sendEmail(order)); // Consumer > doesn't return a value


        // Main thread will never been blocked
        // By defalut internally it uses a ForkJoinPool.commonPool()

        /* Exception handling*/
        CompletableFuture.supplyAsync(() -> getOrder()) // Starts the execution in new thread
                .thenApplyAsync(order -> enrich(order))  // Supplyer > returns a value //
                .thenApplyAsync(order -> performPayment(order))
                .exceptionally(error -> new FailedOrder(error)) // In case of exception, in any of the options above. FailedOrder instance will be passed to next che
                .thenApplyAsync(order -> dispatch(order))
                .thenAccept(order -> sendEmail(order)); // Consumer > doesn't return a value
    }

    Order getOrder() {
        return new Order();
    }

    Order enrich(Order order) {
        return order;
    }

    Order performPayment(Order order) {
        return order;
    }

    Order dispatch(Order order) {
        return order;
    }

    private void sendEmail(Order order) {
    }
}

class Order {

}

class FailedOrder extends Order {

private final Throwable error;

    FailedOrder(Throwable error) {
        this.error = error;
    }
}