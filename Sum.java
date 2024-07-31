//package com.arpil;

public class Sum {
    public static void main(String args[]) {
        System.out.println(sum(1000));
    }

    // calculate sum of first n natural number
    static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return sum(n - 1) + n;
    }
}
