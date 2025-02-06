package InputStreamReader;

import org.InputStreamReader.convert_byte_stream_to_character_stream.Convert_Byte_Stream_to_Character_Stream1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ConvertStreamTest {

    @Test
    void displayStream(){
        String filePath="src/main/java/org/InputStreamReader/convert_byte_stream_to_character_stream/DemoFile2.txt";
        Convert_Byte_Stream_to_Character_Stream1.display(filePath);
        System.out.println("Testing Completed");
    }
}
