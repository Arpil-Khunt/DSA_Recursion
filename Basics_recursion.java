//package com.arpil;

public class Basics_recursion {
    public static void main(String args[]) {
        print(10);
    }

    static void print1(int n) {
        System.out.println(n);
        print2(n - 1);
    }

    static void print2(int n) {
        System.out.println(n);
        print3(n - 1);
    }

    static void print3(int n) {
        System.out.println(n);
        print4(n - 1);
    }

    static void print4(int n) {
        System.out.println(n);

    }

    // here all print function has same task, but we create all print function
    // different this is not good programming way because in programming
    // there is no duplicate code in this scenario recursion concept come
    // Recursion -> means function calling

    // Above task we can do in following way also
    // This function print num from 10 -> 0
    static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        // this is called tail recursion
        print(n - 1);

    }
}
