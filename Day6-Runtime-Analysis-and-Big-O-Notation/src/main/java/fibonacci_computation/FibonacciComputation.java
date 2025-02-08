package fibonacci_computation;

public class FibonacciComputation {
    public static int fibonacciRecursive(int n){
        if(n<=1) return n;
        return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
    }

    public static int fibonacciIterative(int n){
        int a=0,b=1,sum=0;
        for(int i=2;i<=n;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] num={10,30,50};
        for(int i=0;i<num.length;i++){
            long startTime,endTime;
            System.out.println("Comparing execution time for calculating" +num[i] + " fibonacci number ");

            //calculating fibonacci using Iterative approach
            startTime=System.nanoTime();
            startTime=System.nanoTime();
            long num1=fibonacciIterative(num[i]);
            endTime=System.nanoTime();
            System.out.println("Iterative fibonacci : " + (endTime-startTime) + " ns");

            //calculating fibonacci using Iterative approach
            startTime=System.nanoTime();
            long num2=fibonacciRecursive(num[i]);
            endTime=System.nanoTime();
            System.out.println("Recursive fibonacci : " + (endTime-startTime) + " ns");
        }
    }
}
