package binary_search;

import org.binary_search.Find_Rotation_Point_in_Rotated_Sorted_Array.Find_Rotation_Point_in_Rotated_Sorted_Array1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindRotationTest {

   @Test
   void binarySearchTest(){
      Find_Rotation_Point_in_Rotated_Sorted_Array1 obj=new Find_Rotation_Point_in_Rotated_Sorted_Array1();
      int[] arr1={5,6,7,8,9,1,2,3,4};
      int smallest=obj.binarySearch(arr1);
      assertEquals(1,smallest);
   }
}
