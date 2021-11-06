package com.test.core.java8.lambda_expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class LambdaTest3 {
    static class A {
        public A(String a, int b) {
            s = a;
            val = b;
        }

        public String s;
        public int val;

        @Override
        public String toString() {
            return "A [s=" + s + ", val=" + val + "]";
        }

    }

    ;

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 50, 60);

        // Get Smaller no
        Optional<Integer> reduce2 = numbers.stream().reduce((a, b) -> a < b ? a : b);
        System.out.println("1. reduce Item : " + reduce2);

        // Get Bigger no
        reduce2 = numbers.stream().reduce((a, b) -> a > b ? a : b);
        System.out.println("2. reduce Item : " + reduce2);

//		Integer integer = numbers.stream().reduce(new Integer(0), (a, b) -> a > 500 ? a : Optional.of(new In));
//		System.out.println("3. reduce Item : " + integer);

        List<A> list = new ArrayList<>();
        list.add(new A("A", 286));
        list.add(new A("B", 512));
        list.add(new A("C", 268));
        list.add(new A("D", 258));
        list.add(new A("E", 431));
        list.add(new A("F", 289));

        System.out.println("List.forEach");
        list.forEach(System.out::println);

        Optional<A> findFirst = list.stream().findFirst();
        // new BinaryOperator<LambdaTest3.A>() {
        //
        // @Override
        // public A apply(A t, A u) {
        // // TODO Auto-generated method stub
        // return null;
        // }
        // }
        System.out.println("1st Item before : " + list.get(0));
        A reduce = list.stream().reduce(list.get(0), (a, b) -> a);
        System.out.println("1st Item after : " + list.get(0));
        System.out.println("reduce Item : " + reduce);

    }
}
