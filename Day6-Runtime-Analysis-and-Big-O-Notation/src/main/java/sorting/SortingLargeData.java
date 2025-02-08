package sorting;

import java.util.Arrays;

public class SortingLargeData {
   public static void bubbleSort(int[] arr){
       for(int i=0;i<arr.length-1;i++){
           for(int j=0;j<arr.length-i-1;j++){
               if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
       }
   }

   public static void mergeSort(int[] arr,int start,int end){
       if(start<end){
           int mid=start+(end-start)/2;
           mergeSort(arr,start,mid);
           mergeSort(arr,mid+1,end);
           merge(arr,start,mid,end);
       }
   }

   public static void merge(int[] arr, int start, int mid, int end){
       int n=mid-start+1;
       int m= end-mid;

       int[] leftArray=new int[n];
       int[] rightArray=new int[m];

       //copying array
       for(int i=0;i<n;i++){
           leftArray[i]=arr[start+i];
       }

       for(int i=0;i<m;i++){
           rightArray[i]=arr[mid+i+1];
       }

       int i=0,j=0,index=start;
       while(i<n&&j<m){
           if(leftArray[i]<=rightArray[j]){
               arr[index]=leftArray[i];
               i++;
               index++;
           }else{
               arr[index]=rightArray[j];
               j++;
               index++;
           }
       }

       while(i<n){
           arr[index]=leftArray[i];
           i++;
           index++;
       }

       while(j<m){
           arr[index]=rightArray[j];
           j++;
           index++;
       }

   }

   public static void quickSort(int[] arr, int start, int end){
       if(start<end){
           int pivot=partition(arr,start,end);
           quickSort(arr,start,pivot-1);
           quickSort(arr,pivot+1,end);
       }
   }

   public static int partition(int[] arr, int start, int end){
        int pivot=arr[end];
        int i=start-1;
        for(int j=start;j<end;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[end];
        arr[end]=temp;
        return i+1;
   }

    public static void main(String[] args) {
        int sizes[]={1000,10000,1000000};
        for(int i=0;i<3;i++) {
            int arr[] = new int[sizes[i]];
            for (int j = 0; j < sizes[i]; j++) {
                arr[j] = (int)(Math.random()*100000);
            }
            int target = sizes[i] - 100;

            long startTime, endTime;
            System.out.println("Comparing execution time for size of " + sizes[i] + " elements.");


            //merge sort
            for (int j = 0; j < sizes[i]; j++) {
                arr[j] = (int)(Math.random()*100000);
            }
            startTime = System.nanoTime();
                mergeSort(arr,0,arr.length-1);
            endTime=System.nanoTime();
            System.out.println("Merge sort time: " + (double)(endTime-startTime)/1000 + " ms");

            //Quick sort
            for (int j = 0; j < sizes[i]; j++) {
                arr[j] = (int)(Math.random()*100000);
            }
            startTime = System.nanoTime();
            quickSort(arr,0,arr.length-1);
            endTime=System.nanoTime();
            System.out.println("Quick sort time: " + (double)(endTime-startTime)/1000 + " ms");

            //bubble sort
            for (int j = 0; j < sizes[i]; j++) {
                arr[j] = (int)(Math.random()*100000);
            }
            startTime = System.nanoTime();
            if(i!=2){
                bubbleSort(arr);
            }
            endTime=System.nanoTime();
            System.out.println("Bubble sort time: " + (double)(endTime-startTime)/1000 + " ms");

        }

//        int arr[]={7,1,2,8,6,19,0,6};
//        int arrTemp[]={7,1,2,8,6,19,0,6};
//        Arrays.sort(arrTemp);
//        quickSort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arrTemp));
//        System.out.println(Arrays.toString(arr));

    }
}
