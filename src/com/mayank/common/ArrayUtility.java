package com.mayank.common;

public class ArrayUtility {


    public static void  printArray(int[] arr){
        for(int i: arr){
            System.out.print(i);
        }
    }

    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
