package string_buffer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.string_buffer.compare_stringbuilder_and_stringbuffer.Compare_stringBuilder_and_StringBuffer2;

public class CompareStringTest {

    @Test
    void stringBuilderAndBuilderPerformanceTest(){

        long builderTime= Compare_stringBuilder_and_StringBuffer2.stringBuilderPerformance();
        long bufferTime=Compare_stringBuilder_and_StringBuffer2.stringBufferPerformance();

        assertTrue(builderTime<bufferTime);
    }

}
