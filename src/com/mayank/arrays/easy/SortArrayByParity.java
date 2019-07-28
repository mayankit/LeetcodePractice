package com.mayank.arrays.easy;

import com.mayank.common.ArrayUtility;

public class SortArrayByParity {

    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        sortArrayByParity.sort(arr);
        ArrayUtility.printArray(arr);
    }

    private void sort(int[] arr) {
        int left= 0;
        int right = arr.length;

        while(left < right){
            if(arr[left]% 2 ==0){
                left++;
            }else{
                if(arr[right-1] %2 != 0){
                    right--;
                }else{
                    ArrayUtility.swap(arr,left,right-1);
                }
            }
        }
    }


}
