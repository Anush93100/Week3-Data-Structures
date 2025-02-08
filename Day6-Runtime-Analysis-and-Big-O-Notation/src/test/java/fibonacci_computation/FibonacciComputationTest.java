package fibonacci_computation;

import org.junit.jupiter.api.Test;

public class FibonacciComputationTest {
    @Test
    void fibonacciTest(){
        int[] num={10,30,50};
        for(int i=0;i<num.length;i++){
            long startTime,endTime;
            System.out.println("Comparing execution time for calculating" +num[i] + " fibonacci number ");

            //calculating fibonacci using Iterative approach
            startTime=System.nanoTime();
            startTime=System.nanoTime();
            long num1=FibonacciComputation.fibonacciIterative(num[i]);
            endTime=System.nanoTime();
            System.out.println("Iterative fibonacci : " + (endTime-startTime) + " ns");

            //calculating fibonacci using Iterative approach
            startTime=System.nanoTime();
            long num2=FibonacciComputation.fibonacciRecursive(num[i]);
            endTime=System.nanoTime();
            System.out.println("Recursive fibonacci : " + (endTime-startTime) + " ns");
    }
}
}

