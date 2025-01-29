package singly_linked_list.inventory_management_system;

public class InventoryLinkedList {
    private InventoryItemNode head;

    //method to add node at beginning of Linked list
    public void addAtBeginning(String itemName, int itemId, int quantity, double price){
        InventoryItemNode newNode=new InventoryItemNode(itemName, itemId, quantity, price);
        newNode.next=head;
        head=newNode;
    }

    //method to add node at end of linked list
    public void addAtEnd(String itemName, int itemId, int quantity, double price){
        InventoryItemNode newNode=new InventoryItemNode(itemName, itemId, quantity, price);
        if(head==null){
           head=newNode;
           return;
        }
        InventoryItemNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    //method to add node at specific position
    public void addAtPosition(int position, String itemName, int itemId, int quantity, double price){
        if (position < 0) {
            System.out.println("Invalid position.");
            return;
        }
        if(position==0){
            addAtBeginning(itemName,itemId,quantity,price);
            return;
        }
        InventoryItemNode newNode=new InventoryItemNode(itemName,itemId,quantity,price);
        InventoryItemNode temp=head;
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

    //method to delete the node by item id
    public void deleteByItemId(int itemId){
        if(head==null){
            System.out.println("List is already empty.");
            return;
        }
        if(head.itemId==itemId){
            System.out.println("Inventory item with item id " + itemId + " is deleted.");
            head=head.next;
            return;
        }
        InventoryItemNode temp=head;
        while(temp.next!=null){
            if(temp.next.itemId==itemId){
                System.out.println("Inventory item with item id " + itemId + " is deleted.");
                temp.next=temp.next.next;
                return;
            }
            temp=temp.next;
        }
        System.out.println("Inventory item not found.");
    }

    //method to update quantity of the item by item id
    public void updateQuantity(int itemId, int quantity){
        InventoryItemNode temp=head;
        while(temp!=null){
            if(temp.itemId==itemId){
                temp.quantity=quantity;
                System.out.println("Quantity updated for item id " + itemId + ".");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Item with id " + itemId + " not found.");
    }

    //method to search an item by item id
    public void searchByItemId(int itemId){
        InventoryItemNode temp=head;
        while(temp!=null){
            if(temp.itemId==itemId){
                System.out.println("Item Found: Item Name = " + temp.itemName + ", Item ID = " + temp.itemId +
                        ", quantity = " + temp.quantity + ", price = " + temp.price);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Item with id " + itemId + " not found.");
    }

    //method to search an item by name
    public void searchByItemName(String itemName){
        InventoryItemNode temp=head;
        while(temp!=null){
            if(temp.itemName == itemName){
                System.out.println("Item Found: Item Name = " + temp.itemName + ", Item ID = " + temp.itemId + ", quantity = "
                        + temp.quantity + ", price = $" + temp.price);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Item with name " + itemName + " not found.");
    }

    //method to calculate the total price of inventory
    public void calculateTotalPrice(){
        InventoryItemNode temp=head;
        double total=0;
        while(temp!=null){
            int quantity=temp.quantity;
            double price=temp.price;
            total = total + price * quantity;
            temp=temp.next;
        }
        System.out.println("Total price of Inventory = $" + total);
    }

    //method to display all item
    public void displayAll(){
        InventoryItemNode temp=head;
        System.out.println("-----Inventory Items-----\n");
        while(temp!=null){
            System.out.println("Item name  :" + temp.itemName);
            System.out.println("Item Id    :" + temp.itemId);
            System.out.println("Price      :$" + temp.price);
            System.out.println("Quantity   :" + temp.quantity + "\n");
            temp=temp.next;
        }
    }


    // Sort the inventory by Item Name or Price
    public void sort(String by) {
        head = mergeSort(head, by);
        System.out.println("Inventory sorted by " + (by.equals("name") ? "Item Name." : "Price."));
    }

    private InventoryItemNode mergeSort(InventoryItemNode head, String by) {
        if (head == null || head.next == null) {
            return head;
        }

        InventoryItemNode mid = getMiddle(head);
        InventoryItemNode nextOfMid = mid.next;
        mid.next = null;

        InventoryItemNode left = mergeSort(head, by);
        InventoryItemNode right = mergeSort(nextOfMid, by);

        return merge(left, right, by);
    }

    private InventoryItemNode getMiddle(InventoryItemNode head) {
        if (head == null) return head;
        InventoryItemNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private InventoryItemNode merge(InventoryItemNode left, InventoryItemNode right, String by) {
        if (left == null) return right;
        if (right == null) return left;

        InventoryItemNode result;
        if (by.equals("name")) {
            if (left.itemName.compareToIgnoreCase(right.itemName) <= 0) {
                result = left;
                result.next = merge(left.next, right, by);
            } else {
                result = right;
                result.next = merge(left, right.next, by);
            }
        } else {
            if (left.price <= right.price) {
                result = left;
                result.next = merge(left.next, right, by);
            } else {
                result = right;
                result.next = merge(left, right.next, by);
            }
        }
        return result;
    }
}
