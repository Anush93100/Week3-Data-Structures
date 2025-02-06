package org.binary_search.Peak_Element_in_an_Array;

import java.util.Arrays;

public class Peak_Element_in_an_Array2 {
    public static int peakElement(int[] arr){
        int left=0;
        int right=arr.length-1;
        int peak=arr[0];
        while(left<right){
            int mid=(left+right)/2;

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                peak=arr[mid];
                break;
            }else if(arr[mid]<arr[mid+1]){
                left=mid+1;
            }else if(arr[mid]<arr[mid-1]){
                right=mid-1;
            }
        }
        return peak;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 3};
        int value=peakElement(arr);
        System.out.println("Given array: " + Arrays.toString(arr));
        System.out.println("Peak element: " + value);
    }
}
