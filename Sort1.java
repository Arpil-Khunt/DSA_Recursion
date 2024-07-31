//package com.arpil;

public class Sort1 {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 4, 4, 5, 4, 3 };
        // System.out.println(isSorted(arr,0));
        // System.out.println(firstOccurrence(arr,3,0));
        System.out.println(lastOccurrence(arr, 3, arr.length - 1));
    }

    static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] <= arr[i + 1]) {
            return isSorted(arr, i + 1);
        }
        return false;
    }

    // First Occurrence of an element
    static int firstOccurrence(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == target) {
            return i;
        }

        return firstOccurrence(arr, target, i + 1);
    }

    // Last Occurrence of an element
    static int lastOccurrence(int[] arr, int target, int i) {
        if (i == -1) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return lastOccurrence(arr, target, i - 1);
    }
}
