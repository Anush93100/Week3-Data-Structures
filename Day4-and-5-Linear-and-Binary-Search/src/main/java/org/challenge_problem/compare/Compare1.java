package org.challenge_problem.compare;

import java.io.*;

public class Compare1 {

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

    public static long fileReaderPerformance(String filePath){
        long startTime, endTime;
        long answer=0;
        try (BufferedReader br=new BufferedReader(new FileReader(filePath))) {
            startTime = System.nanoTime();
            String line;
            int count=0;
            while((line=br.readLine())!=null){
                count++;
            }
            endTime = System.nanoTime();
            //System.out.println("FileReader Time       : " + (endTime - startTime) + " ns");
            answer=(endTime - startTime);
        }catch(IOException e){
            e.printStackTrace();
        }
        return answer;
    }

    public static long inputStreamReaderPerformance(String filePath){
        long startTime, endTime;
        long answer=0;
        try (InputStreamReader is=new InputStreamReader(new FileInputStream(filePath));
             BufferedReader br=new BufferedReader(is)) {
            startTime = System.nanoTime();
            String line;
            int count=0;
            while((line= br.readLine())!=null){
                count++;
            }
            endTime = System.nanoTime();
            //System.out.println("InputStreamReader Time: " + (endTime - startTime) + " ns");
            answer=(endTime - startTime);
        }catch(IOException e){
            e.printStackTrace();
        }
        return answer;
    }

    public static void main(String[] args) {
        long startTime, endTime;
        long builderTime=stringBuilderPerformance();
        System.out.println("StringBuilder Time: " + builderTime + " ns");

        long bufferTime=stringBufferPerformance();
        System.out.println("StringBuffer Time : " + bufferTime + " ns");

        String filePath="src/main/java/org/challenge_problem/compare/DemoFile5.txt";

        long fileReaderTime=fileReaderPerformance(filePath);
        System.out.println("FileReader Time       : " + fileReaderTime + " ns");

        long inputStreamReaderTime=inputStreamReaderPerformance(filePath);
        System.out.println("InputStreamReader Time: " + inputStreamReaderTime + " ns");
    }
}
