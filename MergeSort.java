//package com.arpil.Sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String args[]){
        int[] arr = {10,8,9,3,5,4,2};
       mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    //MergeSort, manipulating in same array
    static void mergeSortInPlace(int[] arr,int s , int e){
        if(e-s == 1){
            return;
        }
        int mid = (s+e)/2;
        //Here, in copyOfRange last index is exclusive
         mergeSortInPlace(arr,0,mid);
         mergeSortInPlace(arr,mid,e);

         mergeInPlace(arr,s,mid,e);
    }

    static void mergeInPlace(int[] arr, int s, int mid, int e){
       int[] mix = new int[e-s];
       int i = s;
       int j = mid;
       int k = 0;
       while(i < mid && j<e){
           if(arr[i]<= arr[j]){
               mix[k]= arr[i];
               i++;
           }else{
               mix[k]=arr[j];
               j++;
           }
           k++;
       }
       while(i<mid){
           mix[k]=arr[i];
           i++;
           k++;
       }
       while(j<e){
           mix[k]=arr[j];
           j++;
           k++;
       }

       //now the copy mix, into main array
       for(int l = 0 ; l < mix.length ; l++){
           arr[s+l] = mix[l];
       }

    }

    //MergeSort by creating new array in each step
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length /2;
        //Here, in copyOfRange last index is exclusive
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length+second.length];
        int i=0;
        int j = 0;
        int k = 0;
        while(i<first.length && j<second.length){
            if(first[i] <= second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}

