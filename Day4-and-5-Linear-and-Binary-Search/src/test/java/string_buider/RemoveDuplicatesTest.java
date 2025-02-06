package string_buider;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.string_builder.remove_duplicates.RemoveDuplicates2;

public class RemoveDuplicatesTest {

    @Test
    void removingTest(){
        String s="HelloWorld";
        String rev= RemoveDuplicates2.removeDuplicates(s);
        assertEquals("HeloWrd",rev);
    }

}
