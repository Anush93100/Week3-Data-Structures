package doubly_linked_list.library_management_system;


public class LibraryLinkedList {
    private BookNode head, tail;

    LibraryLinkedList(){
      this.head=null;
      this.tail=null;
    }

    //1.method to add new node at beginning
    public void addAtBeginning(String bookTitle, String author, String genre, int bookId, String availabilityStatus){
        BookNode newNode =new BookNode(bookTitle, author, genre, bookId, availabilityStatus);
        if(head==null){
           //newNode.next=head;
           head=newNode;
           tail=newNode;
           return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    //1.method to add new node at end
    public void addAtEnd(String bookTitle, String author, String genre, int bookId, String availabilityStatus){
        BookNode newNode=new BookNode(bookTitle,author,genre,bookId,availabilityStatus);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        newNode.prev=tail;
        tail.next=newNode;
        tail=newNode;
    }

    //1.method to add node at specific position
    public void addAtPosition(int position, String bookTitle, String author, String genre, int bookId, String availabilityStatus){
        if(position<0){
            System.out.println("Invalid position.");
            return;
        }
        if(position==0){
            addAtBeginning(bookTitle,author,genre,bookId,availabilityStatus);
            return;
        }
        BookNode newNode =new BookNode(bookTitle,author,genre,bookId,availabilityStatus);
        BookNode temp=head;
        for(int i=0;temp!=null && i<position-1;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Position overflow.");
            return;
        }
        newNode.prev=temp;
        newNode.next=temp.next;
        if(temp.next!=null){
            temp.next.prev=newNode;
        }
        temp.next=newNode;

        if(temp==tail){
            tail=newNode;
        }
    }

    //2.method to remove a book by book id
    public void deleteByBookId(int bookId){
        if(head==null){
            System.out.println("List is already empty.");
            return;
        }
        if(head.bookId==bookId){
            head=head.next;
            if(head!=null){
                 head.prev=null;
            }
            System.out.println("Book with id " + bookId + " is deleted.");
            return;
        }
        BookNode temp=head;
        while(temp.next!=null){
            if(temp.next.bookId==bookId){
                if(temp.next.next!=null){
                    temp.next.next.prev=temp;
                }
                temp.next=temp.next.next;
                System.out.println("Book with id " + bookId + " is deleted.");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Book with id " + bookId + " not found.");
    }

    //3.method to Search for a book by Book Title.
    public void searchByBookTitle(String bookTitle){
        BookNode temp=head;
        while(temp!=null){
            if(temp.bookTitle.equals(bookTitle)){
             System.out.println("Book Found : Title = " +temp.bookTitle + ", Author = " + temp.author + ", Genre = "
                                + temp.genre + ", BookId = " + temp.bookId + ", availability = " + temp.availabilityStatus);
             return;
           }
           temp=temp.next;
        }
        System.out.println("Book with title " + bookTitle + " not found.");
    }

    //3.method to Search for a book by Book Author.
    public void searchByAuthor(String author){
        BookNode temp=head;
        while(temp!=null){
            if(temp.bookTitle.equals(author)){
                System.out.println("Book Found : Title = " +temp.bookTitle + ", Author = " + temp.author + ", Genre = "
                        + temp.genre + ", BookId = " + temp.bookId + ", availability = " + temp.availabilityStatus);
                //return;
            }
            temp=temp.next;
        }
        System.out.println("Book with author " + author + " not found.");
    }

    //4.method to update a book’s Availability Status by book Id
    public void updateAvailabilityStatus(int bookId, String availabilityStatus){
        BookNode temp=head;
        while(temp!=null){
            if(temp.bookId==bookId){
                temp.availabilityStatus=availabilityStatus;
                System.out.println("Book's availability status with id " + bookId +" is updated.");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Book with id " + bookId + " not found.");
    }

    //5.method to display all books in forward order.
    public void displayForward(){
        BookNode temp=head;
        System.out.println("Books record in forward order.\n");
        while(temp!=null){
            System.out.println("ID       :" +temp.bookId);
            System.out.println("Title    :" +temp.bookTitle);
            System.out.println("Author   :" +temp.author);
            System.out.println("Genre    :" +temp.genre);
            System.out.println("Availability status:" +temp.availabilityStatus + "\n");
            temp=temp.next;
        }
    }

    //5.method to display all books in backword order.
    public void displayBackward(){
        BookNode temp=tail;
        System.out.println("Books record in backward order.\n");
        while(temp!=null){
            System.out.println("ID       :" +temp.bookId);
            System.out.println("Title    :" +temp.bookTitle);
            System.out.println("Author   :" +temp.author);
            System.out.println("Genre    :" +temp.genre);
            System.out.println("Availability status:" +temp.availabilityStatus + "\n");
            temp=temp.prev;
        }
    }

    //6.method to count total number of books.
    public int countBooks(){
        int bookCount=0;
        BookNode temp=head;
        while(temp!=null){
            bookCount++;
            temp=temp.next;
        }
        return bookCount;
    }

}
