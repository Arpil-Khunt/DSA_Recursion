
//package com.arpil;
import java.util.Scanner;

public class Fibonnaci {

    // Brute force approach -> By Me
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count: ");
        int count = sc.nextInt();
        System.out.println();

        int n1 = 0;
        int n2 = 1;
        if (count == 1) {
            System.out.print(n1 + " ");
        }
        if (count >= 2) {
            count = count - 2;
            System.out.print(n1 + " " + n2 + " ");
            fibonnaci(n1, n2, count);
        }
        System.out.println();
        System.out.print("Enter a number index which you want to get fibonnaci: ");
        int n = sc.nextInt();
        System.out.println();
        System.out.print(fibo(n));

    }

    // nth fibonnaci number
    static int fibo(int n) {
        // base case
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    static void fibonnaci(int n1, int n2, int count) {
        if (count == 0) {
            return;
        }
        int n3 = 0;
        n3 = n1 + n2;
        System.out.print(n3 + " ");
        fibonnaci(n2, n3, --count);
    }
}
