package binary_search;

import org.binary_search.First_and_Last_Occurrence_of_an_Element.First_and_Last_Occurrence_of_an_Element4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OccurenceTest {

    @Test
    void firstOccrenceTest(){

        int[] arr={1,2,4,6,7,7,8,9,9,9};
        int target=9;
        int firstIndex=First_and_Last_Occurrence_of_an_Element4.firstOccurrence(arr,target);

        assertEquals(7,firstIndex);
    }

    @Test
    void lastOccrenceTest(){

        int[] arr={1,2,4,6,7,7,8,9,9,9};
        int target=9;
        int lastIndex=First_and_Last_Occurrence_of_an_Element4.lastOccurrence(arr,target);

        assertEquals(9,lastIndex);
    }
}
