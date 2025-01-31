package sorting_algorithms.merge_sort;

public class Sort_an_Array_of_Book_Prices3 {
    public static void main(String[] args) {
        int[] bookPrice = {12, 11, 13, 5, 6, 7};

        System.out.println("Array of book price before sorting.");
        for(int price:bookPrice){
            System.out.print(price + " ");
        }

        MergeSort obj=new MergeSort();
        obj.mergesort(bookPrice,0,bookPrice.length-1);
        System.out.println("\nArray of book price after sorting.");
        for(int price:bookPrice){
            System.out.print(price + " ");
        }

    }
}
