package concatenation;

import org.junit.jupiter.api.Test;

public class stringConcatenationPerformanceTest {
    @Test
    void performanceTest(){
        int[] sizes={1000,10000,1000000};
        for(int i=0;i<sizes.length;i++){
            long startTime,endTime;

            System.out.println("Comparing execution time of concatenation in string with " + sizes[i] + " operations.");

            //String buffer
            startTime=System.nanoTime();
            StringBuffer s2=StringConcatenationPerformance.bufferConcatenate(sizes[i]);
            endTime=System.nanoTime();
            System.out.println("String Buffer concatenation time :" + (double)(endTime-startTime)/1000000 + "ms");

            //String builder
            startTime=System.nanoTime();
            StringBuilder s3=StringConcatenationPerformance.builderConcatenate(sizes[i]);
            endTime=System.nanoTime();
            System.out.println("String Builder concatenation time :" + (double)(endTime-startTime)/1000000 + "ms");

            //String concatenation
            startTime=System.nanoTime();
            String s1=StringConcatenationPerformance.stringConcatenate(sizes[i]);
            endTime=System.nanoTime();
            System.out.println("String class concatenation time :" + (double)(endTime-startTime)/1000000 + "ms");

        }
    }
}
