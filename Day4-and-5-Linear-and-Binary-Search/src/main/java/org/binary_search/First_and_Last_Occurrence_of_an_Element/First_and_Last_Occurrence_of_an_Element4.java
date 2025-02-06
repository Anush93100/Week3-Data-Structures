package org.binary_search.First_and_Last_Occurrence_of_an_Element;

public class First_and_Last_Occurrence_of_an_Element4 {

    public static int firstOccurrence(int[] arr, int target){
        int left=0;
        int right=arr.length-1;
        int firstOcc=-1;
        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==target){
                firstOcc=mid;
                right=mid-1;
            }else if(arr[mid]<target){
                left=mid+1;
            }else if(arr[mid]>target){
                right=mid-1;
            }
        }
        return firstOcc;
    }

    public static int lastOccurrence(int[] arr, int target){
        int left=0;
        int right=arr.length-1;
        int lastOcc=-1;
        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==target){
                lastOcc=mid;
                left=mid+1;
            }else if(arr[mid]<target){
                left=mid+1;
            }else if(arr[mid]>target){
                right=mid-1;
            }
        }
        return lastOcc;
    }

    public static void main(String[] args) {
        int[] arr={1,2,4,6,7,7,8,9,9,9};

        int target=9;
        int firstIndex=firstOccurrence(arr,target);
        int lastIndex=lastOccurrence(arr,target);

        System.out.println("The target value is :" + target);
        if(firstIndex!=-1){
            System.out.println("First Occurrence at index : " + firstIndex);
            System.out.println("Last Occurrence at index : " + lastIndex);
        }else{
            System.out.println("Target element is not found.");
        }
    }
}
