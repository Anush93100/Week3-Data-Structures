package doubly_linked_list.library_management_system;

public class LibraryManagementSystem5 {
    public static void main(String[] args) {
        LibraryLinkedList list=new LibraryLinkedList();
        list.addAtBeginning("Java","Ojas Johar","Education",101,"Available");
        list.addAtBeginning("C++","Sejal Chouhan","Education",102,"Available");
        list.addAtEnd("Advance Java","Anush Tenguriya","Education",103,"Not Available");
        list.addAtEnd("HTML","Ojas Johar","Education",104,"Available");
        list.addAtPosition(2,"DBMS","Anush Tenguriya","Education",105,"Available");
        list.addAtPosition(3,"Game of Thrones","Om Tamrakar","Fantasy",106,"Not Available");
        list.displayForward();

        list.deleteByBookId(104);
        list.searchByBookTitle("HTML");
        list.searchByAuthor("Ojas Johar");
        list.updateAvailabilityStatus(101,"Not available");
        list.displayBackward();
        System.out.println("Total number of books in record = " + list.countBooks());

    }
}
