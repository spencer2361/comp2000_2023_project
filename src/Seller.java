public class Seller extends Person {
    public Seller(String storeName, Inventory startingInventory) {
        super(storeName, startingInventory);
    }

    /**
     * Purchases an item. As the Seller does not have a money attribute,
     * the item will always be "bought".
     */
    public void buy(ItemInterface item) {
        super.addItem(item);
    }

    /**
     * Attempt to sell an item by name. If an item with a matching name is
     * found, the item is removed and returned.
     * @param itemName
     * @return The sold item.
     */
    // Inorder to remove the Null values, I will use optional so that it isn't selectively searching for a null value, I can
    public ItemInterface sell(String itemName) {
       super.removeItem(itemName);
    }

    // /**
    //  * Adds an item to the held Inventory.
    //  * @param item
    //  */
    // public void addItem(ItemInterface item) {
    //     inventory.addOne(item);
    // }

    // /**
    //  * Removes and returns an item from the held Inventory that matches
    //  * the `itemName` parameter.
    //  * @param itemName
    //  */
    // public ItemInterface removeItem(String itemName) {
    //     return inventory.removeOne(itemName);
    // }
    
    // public Inventory getInventory() {
    //     return inventory;
    // }

    // public String getName() {
    //     return name;
    // }
    
}
