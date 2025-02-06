package InputStreamReader;

import org.InputStreamReader.read_and_write_to_file.ReadAndWriteToFile2;
import org.file_reader.reading_a_file.ReadingAFile1;
import org.junit.jupiter.api.Test;
public class ReadAndWriteTest {

    @Test
    void testing(){
        String filePath="src/main/java/org/InputStreamReader/read_and_write_to_file/DemoFile3.txt";
        ReadAndWriteToFile2.readAndWrite(filePath);
        System.out.println("Testing Completed");
    }
}
