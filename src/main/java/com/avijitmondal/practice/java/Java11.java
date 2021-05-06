package com.avijitmondal.practice.java;

public class Java11 {

    public static void main(String[] args) {
        Java11 java11 = new Java11();
        java11.test();
    }
    public void test() {
        final var abc = new String("hello");
        System.out.println(abc);
    }
}
