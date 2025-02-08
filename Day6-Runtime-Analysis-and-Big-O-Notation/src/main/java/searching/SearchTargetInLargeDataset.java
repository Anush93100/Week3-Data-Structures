package searching;

public class SearchTargetInLargeDataset {

    public static int linearSearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] sizes={1000,10000,1000000};
        for(int i=0;i<3;i++){
            int arr[]=new int[sizes[i]];
            for(int j=0;j<sizes[i];j++){
                arr[j]=(j+1);
            }
            int target=sizes[i]-100;

            long startTime,endTime;
            System.out.println("Comparing execution time for size of " + sizes[i] + " elements.");

            startTime=System.nanoTime();
            int found1 =linearSearch(arr,target);
            endTime=System.nanoTime();
            if (found1 != -1) {
            System.out.println("Linear Search time: " + (double)(endTime-startTime)/1000 + " ms");
            }

            startTime=System.nanoTime();
            int found2=binarySearch(arr,target);
            endTime=System.nanoTime();
            if(found2!=-1){
            System.out.println("binary Search time: " + (double)(endTime-startTime)/1000 + " ms");
            }

        }
    }
}
