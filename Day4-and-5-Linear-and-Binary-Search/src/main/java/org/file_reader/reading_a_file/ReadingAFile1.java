package org.file_reader.reading_a_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingAFile1 {
    public static void display(String filePath){
        try (BufferedReader br=new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
                //System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String filePath="src/main/java/org/file_reader/reading_a_file/DemoFile.txt";
        display(filePath);
    }
}
