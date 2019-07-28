package com.mayank.arrays.easy;

import com.mayank.common.ArrayUtility;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int [] arr = {-4,-1,0,3,10};
        int[] arr2 = {-7,-3,2,3,11};
        SquaresOfSortedArray ss = new SquaresOfSortedArray();
        int[] newArray = ss.findSquaredSortedArray(arr);
        int[] newArray2 = ss.findSquaredSortedArray(arr2);
        ArrayUtility.printArray(newArray);
        ArrayUtility.printArray(newArray2);
    }

    private int[] findSquaredSortedArray(int[] arr) {
        int[] newArray = new int[arr.length];
        int left = 0;
        int right = arr.length;
        int index = arr.length-1;

        while(left < right){
            if(Math.abs(arr[left]) > Math.abs(arr[right-1])){
                newArray[index]=  arr[left] * arr[left];
                left++;
            }else{
                newArray[index]=  arr[right-1] * arr[right-1];
                right--;
            }
            index--;
        }
        return newArray;
    }
}
