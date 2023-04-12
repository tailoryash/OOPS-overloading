package com.yash.overloading.calculator;

public class Addition {
    //var args used
    public void add(int... args) {
        int result = 0;
        for (int i :
                args) {
            result += i;
        }
        System.out.println("Multiple Args - Addition : " + result);
    }

    public void add(int a, int b, int c) {
        System.out.println("Three Args - Addition: " + (a + b + c));

    }

    public void add(int a, int b) {
        System.out.println("Two Args - Addition : " + (a + b));
    }
}
