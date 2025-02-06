package org.InputStreamReader.read_and_write_to_file;

import java.io.*;

public class ReadAndWriteToFile2 {
    public static void readAndWrite(String filePath){
        try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) {
            FileWriter writer=new FileWriter(filePath);
            String line;

            while(!(line = br.readLine()).equals("exit")){

                writer.write(line + "\n");
                writer.flush();
            }
            System.out.println("Successfully written in the file");
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String filePath="src/main/java/org/InputStreamReader/read_and_write_to_file/DemoFile3.txt";
        readAndWrite(filePath);
    }
}
