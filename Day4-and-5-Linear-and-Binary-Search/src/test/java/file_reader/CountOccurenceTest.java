package file_reader;

import org.file_reader.count_the_occurrence.CountOccurrence2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CountOccurenceTest {
    @Test
    void countingTest(){
        String filePath="src/main/java/org/file_reader/count_the_occurrence/DemoFile1.txt";
        String str="the";
        int count= CountOccurrence2.counting(filePath,str);
        assertEquals(2,count);
    }
}
