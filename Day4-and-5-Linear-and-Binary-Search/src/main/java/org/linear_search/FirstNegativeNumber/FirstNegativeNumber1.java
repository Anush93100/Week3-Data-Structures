package org.linear_search.FirstNegativeNumber;

public class FirstNegativeNumber1 {
    public static int linearSearch(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,4,3,7,3,-4,9,8,2};

        int index=linearSearch(arr);

        if(index==-1){
            System.out.println("No negative number found.");
        }else{
            System.out.println("First Negative number is " + arr[index] + ", found at index " + index);
        }
    }
}
