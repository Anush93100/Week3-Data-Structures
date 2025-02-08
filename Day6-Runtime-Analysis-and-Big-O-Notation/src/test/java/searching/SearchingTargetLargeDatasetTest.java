package searching;

import org.junit.jupiter.api.Test;

public class SearchingTargetLargeDatasetTest {
    @Test
    void searchingTesting(){
        int[] sizes={1000,10000,1000000};
        for(int i=0;i<3;i++) {
            int arr[] = new int[sizes[i]];
            for (int j = 0; j < sizes[i]; j++) {
                arr[j] = (j + 1);
            }
            int target = sizes[i] - 100;

            long startTime, endTime;
            System.out.println("Comparing execution time for size of " + sizes[i] + " elements.");

            startTime = System.nanoTime();
            int found1 = SearchTargetInLargeDataset.linearSearch(arr, target);
            endTime = System.nanoTime();
            if (found1 != -1) {
                System.out.println("Linear Search time: " + (double) (endTime - startTime) / 1000 + " ms");
            }

            startTime = System.nanoTime();
            int found2 = SearchTargetInLargeDataset.binarySearch(arr, target);
            endTime = System.nanoTime();
            if (found2 != -1) {
                System.out.println("binary Search time: " + (double) (endTime - startTime) / 1000 + " ms");
            }
        }
    }
}
