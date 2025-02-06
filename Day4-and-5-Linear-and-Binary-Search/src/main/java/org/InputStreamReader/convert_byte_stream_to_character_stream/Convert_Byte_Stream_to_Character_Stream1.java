package org.InputStreamReader.convert_byte_stream_to_character_stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Convert_Byte_Stream_to_Character_Stream1 {
    public static void display(String filePath){
        try (FileInputStream fi=new FileInputStream(filePath);
             InputStreamReader is=new InputStreamReader(fi);
             BufferedReader br=new BufferedReader(is);)
        {
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            //br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String filePath="src/main/java/org/InputStreamReader/convert_byte_stream_to_character_stream/DemoFile2.txt";
        display(filePath);
    }
}
