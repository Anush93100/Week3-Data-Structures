package singly_linked_list.inventory_management_system;

public class InventoryManagementsystem4 {
    public static void main(String[] args) {
        InventoryLinkedList list = new InventoryLinkedList();
        list.addAtBeginning("Table",101,2,100);
        list.addAtBeginning("Chair",102,8,50);
        list.addAtEnd("Bed",103,1,600);
        list.addAtEnd("Bed Sheet",104,2,80);
        list.addAtPosition(3,"Study Table",105,1,300);
        list.displayAll();

        list.deleteByItemId(105);
        list.updateQuantity(104,1);
        list.searchByItemId(105);
        list.searchByItemName("Bed");
        list.displayAll();
        list.calculateTotalPrice();

        System.out.println("\nSorting inventory by Name:");
        list.sort("name");
        list.displayAll();

        System.out.println("\nSorting inventory by price:");
        list.sort("price");
        list.displayAll();
    }
}
