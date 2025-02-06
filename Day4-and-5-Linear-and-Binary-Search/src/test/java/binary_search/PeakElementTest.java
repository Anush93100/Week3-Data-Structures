package binary_search;

import org.binary_search.Peak_Element_in_an_Array.Peak_Element_in_an_Array2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PeakElementTest {

    @Test
    void peakTest(){
        int[] arr = {1, 2, 4, 5, 7, 8, 3};
        int value= Peak_Element_in_an_Array2.peakElement(arr);

        assertEquals(8,value);
    }
}
