package org.binary_search.Find_Rotation_Point_in_Rotated_Sorted_Array;

public class Find_Rotation_Point_in_Rotated_Sorted_Array1 {
    public static int binarySearch(int[] arr){
        int left=0;
        int right=arr.length-1;
        int smallest=arr[0];
        int mid;
        while(left<=right){
         mid=(left+right)/2;

            if(arr[mid]<arr[right]){
                right=mid;
            }else if(arr[mid]>arr[right]){
                left=mid+1;
            }else if(left==right){
                smallest=arr[left];
                break;
            }

        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3,4};
        int smallest=binarySearch(arr);

        System.out.println("Smallest Number in the rotated sorted array is: " + smallest);
    }
}
