package doubly_linked_list.library_management_system;

public class BookNode {
    String bookTitle;
    String author;
    String genre;
    int bookId;
    String availabilityStatus;
    BookNode next,prev;

    public BookNode(String bookTitle, String author, String genre, int bookId, String availabilityStatus) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.availabilityStatus = availabilityStatus;
        this.next=null;
        this.prev=null;
    }
}
