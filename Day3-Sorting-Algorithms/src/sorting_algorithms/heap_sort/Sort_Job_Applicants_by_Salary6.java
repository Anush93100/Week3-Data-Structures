package sorting_algorithms.heap_sort;

public class Sort_Job_Applicants_by_Salary6 {
    public static void main(String[] args) {
        int[] salaries={100,293,3993,1230,133,2322,1231};

        System.out.println("Salaries of Applicants before sorting.");
        for(int salary:salaries){
            System.out.print(salary + " ");
        }

        HeapSort obj=new HeapSort();
        obj.heapSort(salaries);
        System.out.println("\nSalaries of Applicants after sorting.");
        for(int salary:salaries){
            System.out.print(salary + " ");
        }

    }
}
