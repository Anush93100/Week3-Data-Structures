package file_reader;

import org.file_reader.count_the_occurrence.CountOccurrence2;
import org.file_reader.reading_a_file.ReadingAFile1;
import org.junit.jupiter.api.Test;
public class ReadingAFileTest {
    @Test
    void displayTest(){
        String filePath="src/main/java/org/file_reader/reading_a_file/DemoFile.txt";
        ReadingAFile1.display(filePath);
        System.out.println("testing Completed.");
    }
}
