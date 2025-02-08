package concatenation;

public class StringConcatenationPerformance {
    public static String stringConcatenate(int number){
        String s="";
        while(number>0){
            s=s+"a";
            number--;
        }
        return s;
    }

    public static StringBuilder builderConcatenate(int number){
        StringBuilder s=new StringBuilder();
        while(number>0){
            s.append("a");
            number--;
        }
        return s;
    }

    public static StringBuffer bufferConcatenate(int number){
        StringBuffer s=new StringBuffer();
        while(number>0){
            s.append("a");
            number--;
        }
        return s;
    }

    public static void main(String[] args) {

        int[] sizes={1000,10000,1000000};
        for(int i=0;i<sizes.length;i++){
            long startTime,endTime;

            System.out.println("Comparing execution time of concatenation in string with " + sizes[i] + " operations.");

            //String buffer
            startTime=System.nanoTime();
            StringBuffer s2=bufferConcatenate(sizes[i]);
            endTime=System.nanoTime();
            System.out.println("String Buffer concatenation time :" + (double)(endTime-startTime)/1000000 + "ms");

            //String builder
            startTime=System.nanoTime();
            StringBuilder s3=builderConcatenate(sizes[i]);
            endTime=System.nanoTime();
            System.out.println("String Builder concatenation time :" + (double)(endTime-startTime)/1000000 + "ms");

            //String concatenation
            startTime=System.nanoTime();
            String s1=stringConcatenate(sizes[i]);
            endTime=System.nanoTime();
            System.out.println("String class concatenation time :" + (double)(endTime-startTime)/1000000 + "ms");

        }
    }
}
