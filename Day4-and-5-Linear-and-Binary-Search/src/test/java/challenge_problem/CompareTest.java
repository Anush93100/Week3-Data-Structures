package challenge_problem;

import org.challenge_problem.compare.Compare1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompareTest {

    @Test
    void stringBuilderAndBuilderPerformanceTest(){

        long builderTime=Compare1.stringBuilderPerformance();
        long bufferTime=Compare1.stringBufferPerformance();

        assertTrue(builderTime<bufferTime);
    }

    @Test
    void filePerformanceTest(){
        String filePath="src/main/java/org/challenge_problem/compare/DemoFile5.txt";
          long fileReaderTime=Compare1.fileReaderPerformance(filePath);
          long inputReaderPerformance=Compare1.inputStreamReaderPerformance(filePath);

          assertTrue(fileReaderTime >inputReaderPerformance);
    }
}
