package singly_linked_list.inventory_management_system;

//creating inventory item node
public class InventoryItemNode {
    String itemName;
    int itemId;
    int quantity;
    double price;
    InventoryItemNode next;

    public InventoryItemNode(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
