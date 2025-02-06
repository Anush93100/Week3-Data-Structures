package linear_search;

import org.junit.jupiter.api.Test;
import org.linear_search.FirstNegativeNumber.FirstNegativeNumber1;

import static org.junit.jupiter.api.Assertions.*;
public class FirstNegativeTest {

    @Test
    void firstNegativeNumberTest(){
        int[] arr1={1,4,3,7,3,-4,9,8,2};
        int[] arr2={1,4,3,7,3,4,9,8,2};
        int index1= FirstNegativeNumber1.linearSearch(arr1);
        int index2= FirstNegativeNumber1.linearSearch(arr2);

        assertEquals(5,index1);
        assertEquals(-1,index2);

    }
}
