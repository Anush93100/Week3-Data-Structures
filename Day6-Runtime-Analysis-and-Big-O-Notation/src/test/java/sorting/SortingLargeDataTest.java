package sorting;

import org.junit.jupiter.api.Test;

public class SortingLargeDataTest {

    @Test
    void sortingTest() {
        int sizes[] = {1000, 10000, 1000000};
        for (int i = 0; i < 3; i++) {
            int arr[] = new int[sizes[i]];
            for (int j = 0; j < sizes[i]; j++) {
                arr[j] = (int) (Math.random() * 100000);
            }
            int target = sizes[i] - 100;

            long startTime, endTime;
            System.out.println("Comparing execution time for size of " + sizes[i] + " elements.");


            //merge sort
            for (int j = 0; j < sizes[i]; j++) {
                arr[j] = (int) (Math.random() * 100000);
            }
            startTime = System.nanoTime();
            SortingLargeData.mergeSort(arr, 0, arr.length - 1);
            endTime = System.nanoTime();
            System.out.println("Merge sort time: " + (double) (endTime - startTime) / 1000 + " ms");

            //Quick sort
            for (int j = 0; j < sizes[i]; j++) {
                arr[j] = (int) (Math.random() * 100000);
            }
            startTime = System.nanoTime();
            SortingLargeData.quickSort(arr, 0, arr.length - 1);
            endTime = System.nanoTime();
            System.out.println("Quick sort time: " + (double) (endTime - startTime) / 1000 + " ms");


            //bubble sort
            for (int j = 0; j < sizes[i]; j++) {
                arr[j] = (int) (Math.random() * 100000);
            }
            startTime = System.nanoTime();
            if (i != 2) {
                SortingLargeData.bubbleSort(arr);
            }
            endTime = System.nanoTime();
            System.out.println("Bubble sort time: " + (double) (endTime - startTime) / 1000 + " ms");

        }
    }
}
