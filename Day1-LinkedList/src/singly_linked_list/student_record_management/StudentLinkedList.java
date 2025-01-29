package singly_linked_list.student_record_management;

public class StudentLinkedList {
    private StudentNode head;

    //method to add node at beginning of linked list
    public void addAtBeginning(int rollNumber, String name, int age, String grade){
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        newNode.next=head;
        head=newNode;
    }

    //method to add node at end of linked list
    public void addAtEnd(int rollNumber, String name, int age, String grade){
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        if(head==null){
            //newNode.next=head;
            head=newNode;
            return;
        }
        StudentNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        //newNode.next=null;
        temp.next=newNode;
    }

    //method to add node at specific position of linked list
    public void addAtPosition(int position, int rollNumber, String name, int age, String grade){
        if(position<0){
            System.out.println("Invalid position.");
            return;
        }
        if(position==0){
            addAtBeginning(rollNumber, name, age, grade);
            return;
        }

        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        StudentNode temp=head;
        for(int i=0;temp!=null && i<position-1;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Position overflow.");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    //method to delete the node by roll number
    public void deleteByRollNumber(int rollNumber){
        if(head==null){
            System.out.println("List is already empty.");
            return;
        }
        if(head.rollNumber==rollNumber){
            System.out.println("Student with roll Number " + head.rollNumber + " is deleted.");
            head=head.next;
            return;
        }

        StudentNode temp=head;
        while(temp.next!=null && temp.next.rollNumber!=rollNumber){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("Student with roll Number " + head.rollNumber + ", not found.");
            return;
        }
        temp.next=temp.next.next;
        System.out.println("Student with roll Number " + rollNumber + " is deleted.");
    }

    //method to search student node by roll number
    public void searchByRollNumber(int rollNumber){
       StudentNode temp=head;
       while(temp!=null){
           if(temp.rollNumber==rollNumber){
               System.out.println("Student Found: RollNumber=" + temp.rollNumber + ", name=" + temp.name + ", age="
                                  + temp.age + ", grade=" + temp.grade);
               return;
           }
           temp=temp.next;
       }
       System.out.println("Student with roll number " + rollNumber +" not found.");
    }

    //method to search student node by roll number
    public void updateGrade(int rollNumber, String grade){
        StudentNode temp=head;
        while(temp!=null){
            if(temp.rollNumber==rollNumber){
                temp.grade=grade;
                System.out.println("Student's grade with roll number " + rollNumber + " updated.");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Student with roll number " + rollNumber +" not found.");
    }

    //method to display all student record
    public void displayData(){
        if(head==null){
            System.out.println("List is empty, No record found.");
            return;
        }
        StudentNode temp = head;
        System.out.println("-----Student Records-----\n");
        while(temp!=null){
            System.out.println("Roll number  :" + temp.rollNumber);
            System.out.println("Student name :" + temp.name);
            System.out.println("Age          :" + temp.age);
            System.out.println("Grade        :" + temp.grade + "\n");
            temp=temp.next;
        }
    }

}
