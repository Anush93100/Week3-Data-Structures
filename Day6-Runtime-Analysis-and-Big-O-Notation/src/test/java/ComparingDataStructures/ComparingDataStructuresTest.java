package ComparingDataStructures;

import ComparingDifferentDataStructures.ComparingDifferentDataStructuresForSearching;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class ComparingDataStructuresTest {

    @Test
    void dataStructureTesting(){

        int[] size = {1000, 100000, 1000000};
        for (int i = 0; i < size.length; i++) {
            int[] array = new int[size[i]];
            Set<Integer> hashSet = new HashSet<>();
            Set<Integer> treeSet = new TreeSet<>();

            for (int j = 0; j < size[i]; j++) {
                array[i]=(j+1);
                hashSet.add(j+1);
                treeSet.add(j+1);
            }

            int target=size[i]/2;

            System.out.println("Comparing different data structures for searching with n = " + size[i]);
            long startTime,endTime;

            //array searching
            startTime=System.nanoTime();
            boolean found1= ComparingDifferentDataStructuresForSearching.linearSearch(array,target);
            endTime=System.nanoTime();
            System.out.println("Array search Time   : " + (endTime-startTime)/1000 + " ms");

            //array searching
            startTime=System.nanoTime();
            boolean found2=hashSet.contains(target);
            endTime=System.nanoTime();
            System.out.println("HashSet search Time : " + (endTime-startTime)/1000 + " ms");

            //array searching
            startTime=System.nanoTime();
            boolean found3=treeSet.contains(target);
            endTime=System.nanoTime();
            System.out.println("TreeSet search Time : " + (endTime-startTime)/1000 + " ms");

        }
    }
}
