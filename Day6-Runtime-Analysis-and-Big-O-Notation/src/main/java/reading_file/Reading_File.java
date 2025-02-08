package reading_file;


import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reading_File {

    public static void fileReading(String filePath){
        //long firstTime, lastTime;
        try(FileReader fr=new FileReader(filePath)){
            Integer s;
            while((s=fr.read())!=-1) {
                //System.out.print(Character.toChars(s));
           }
        }catch(IOException e){
           // e.printStackTrace();
            System.out.println("Can't read file.");
        }
    }

    public static void inputStreamReading(String filePath){
        try(InputStreamReader isr=new InputStreamReader(new FileInputStream(filePath))){
            Integer s;
            while((s=isr.read())!=-1) {
               // System.out.print(Character.toChars(s));
            }
        }catch(IOException e){
           // e.printStackTrace();
            System.out.println("Can't read file.");
        }
    }

    public static void main(String[] args) {
        String filepath1="src/main/java/reading_file/Demo1.txt";
        String filepath2="src/main/java/reading_file/Demo2.txt";
        String filepath3="src/main/java/reading_file/Demo3.txt";
        String[] files={filepath1,filepath2,filepath3};

        for(int i=0;i<files.length;i++){
            int size=0;
            if(i==0) size=1;
            else if(i==1) size=10;
            else if(i==2) size=100;

            System.out.println("Comparing execution time for file with size = " + size +" MB" );
            long startTime,endTime;

            //FileReader
            startTime=System.nanoTime();
            fileReading(files[i]);
            endTime=System.nanoTime();
            System.out.println("File Reader         : " + (endTime-startTime)/1000000 + " ms");

            //InputStreamReader
            startTime=System.nanoTime();
            inputStreamReading(files[i]);
            endTime=System.nanoTime();
            System.out.println("Input Stream Reader : " + (endTime-startTime)/1000000 + " ms");
        }
    }
}
