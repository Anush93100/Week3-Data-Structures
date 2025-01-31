package sorting_algorithms.insertion_sort;

public class SortEmployeeID2 {
    public static void main(String[] args) {
        int[] employeeIds={11,23,43,23,12,34,54,31,19,17,16,26};

        System.out.println("Employee IDs before sorting.");
        for(int id:employeeIds){
            System.out.print(id + " ");
        }

        InsertionSort obj=new InsertionSort();
        obj.insertionSort(employeeIds);

        System.out.println("\n\nEmployee IDs before sorting.");
        for(int id:employeeIds){
            System.out.print(id + " ");
        }

    }
}
