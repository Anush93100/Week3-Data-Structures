package string_buffer;


import org.junit.jupiter.api.Test;
import org.string_buffer.concatenate_strings.ConcatenateStrings1;

import static org.junit.jupiter.api.Assertions.*;


public class ConcatenateStringTest {

    @Test
    void concatenateTesting(){
        String[] arr={"hello ", "Jee"};
        String con= ConcatenateStrings1.concatenateString(arr);
        assertEquals("hello Jee",con);
    }

}
