package sorting_algorithms.quick_sort;

public class SortProductPrices4 {
    public static void main(String[] args) {
        int[] productPrice={100,200,500,300,204,234,134};

        System.out.println("Price of products before sorting.");
        for(int price:productPrice){
            System.out.print(price + " ");
        }

        QuickSort obj=new QuickSort();
        obj.quickSort(productPrice,0, productPrice.length-1);
        System.out.println("\nPrice of products after sorting.");
        for(int price:productPrice){
            System.out.print(price + " ");
        }

    }

}
