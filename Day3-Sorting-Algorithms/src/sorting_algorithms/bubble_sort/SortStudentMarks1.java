package sorting_algorithms.bubble_sort;

public class SortStudentMarks1 {
    public static void main(String[] args) {
        int[]  marks={98,99,72,89,76,91,65,71,62,75};

        System.out.println("Marks of student before sorting.");
        for(int mark:marks){
            System.out.print(mark + " ");
        }

        BubbleSort obj =new BubbleSort();
        obj.bubbleSort(marks);

        System.out.println("\n\nMarks of student before sorting.");
        for(int mark:marks){
            System.out.print(mark + " ");
        }
    }
}
