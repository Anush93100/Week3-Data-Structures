package org.string_buffer.compare_stringbuilder_and_stringbuffer;

public class Compare_stringBuilder_and_StringBuffer2 {

    //method to test stringBuilder Performance
    public static long stringBuilderPerformance(){
        long startTime, endTime;

        // Testing StringBuilder Performance
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder("Java");
        for (int i = 0; i < 1000000; i++) {
            sb.append(" Performance Test");
        }
        endTime = System.nanoTime();

        return (endTime -startTime);
    }

    public static long stringBufferPerformance(){
        long startTime, endTime;

        // Testing StringBuffer Performance
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer("Java");
        for (int i = 0; i < 1000000; i++) {
            sbf.append(" Performance Test");
        }
        endTime = System.nanoTime();
        return (endTime -startTime);
    }
    public static void main(String[] args) {

        long startTime, endTime;
        long builderTime=stringBuilderPerformance();
        System.out.println("StringBuilder Time: " + builderTime + " ns");

        long bufferTime=stringBufferPerformance();
        System.out.println("StringBuffer Time : " + bufferTime + " ns");

    }
}
