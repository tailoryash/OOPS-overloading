package com.yash.overloading;

import com.yash.overloading.calculator.Addition;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------Calculator---------------------");
        Addition addition = new Addition();
        addition.add(
                2, 3, 4, 5, 6
        );
        addition.add(1, 2, 3);
        addition.add(10, 20);
    }
}
