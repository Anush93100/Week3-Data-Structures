package singly_linked_list.student_record_management;

public class StudentRecordManagement1 {
    public static void main(String[] args) {
        StudentLinkedList list=new StudentLinkedList();
        list.addAtBeginning(12,"Anush Tenguriya",21,"A");
        list.addAtEnd(34,"Ojas Johar",22,"A");
        list.addAtEnd(36,"Sejal Chouhan",22,"A");
        list.addAtPosition(2,35,"Om Tamrakar",21,"A");
        list.displayData();

        list.searchByRollNumber(12);
        list.deleteByRollNumber(35);
        list.updateGrade(12,"B");
        System.out.println("Student data after deletion.");
        list.displayData();
    }
}
