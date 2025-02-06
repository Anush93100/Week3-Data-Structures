package org.file_reader.count_the_occurrence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurrence2 {

    public static int counting(String filePath, String str){
        int count=0;
        try (BufferedReader br=new BufferedReader(new FileReader(filePath))) {
            String line;

            while((line=br.readLine())!=null){
                String[] words=line.split("\\s+");
                for(int i=0;i<words.length;i++){
                    if(words[i].equals(str))
                        count++;
                }
            }

        }catch(IOException e){
            e.printStackTrace();
        }
        return count;
    }
    public static void main(String[] args) {
        String filePath="src/main/java/org/file_reader/count_the_occurrence/DemoFile1.txt";
        String str="the";
        int count=counting(filePath,str);
        System.out.println("count of \"" + str + "\" is " + count);

    }
}
