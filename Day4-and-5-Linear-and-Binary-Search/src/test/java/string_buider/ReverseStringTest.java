package string_buider;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.string_builder.reverse_string.ReverseString1;

public class ReverseStringTest {

    @Test
    void reverseTest(){
        String s="Hello world";
        String rev= ReverseString1.reverseString(s);
        assertEquals("dlrow olleH",rev);
    }
}
