package com.test.core.string;

public class StringPoolTest {

    public static void main(String[] args) {
        String wc = "Welcome";
        String wc2 = "Welcome";

        System.out.println("wc.equals " + wc.equals(wc2) + " <<< It is Equal value!!");
        System.out.println("wc == " + (wc == wc2) + " <<< It's memory locations are equal!!");
        System.out.println("wc.hashCode == " + (wc.hashCode() == wc2.hashCode()) + " <<< It's hashCode is same!!");

        String newwc = new String("Welcome");
        System.out.println("========New WC======= ");
        System.out.println("newwc.equals " + newwc.equals(wc2) + " <<< Its Equal!!");
        System.out.println("newwc == " + (newwc == wc2) + " <<< But, Its memory locations are not equal!!");
        System.out.println("newwc.hashCode == " + (newwc.hashCode() == wc2.hashCode()) + " <<< Its hashCode is same!!");
    }

}