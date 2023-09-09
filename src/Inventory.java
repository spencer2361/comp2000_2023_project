import java.util.ArrayList;
import java.util.Optional;

public class Inventory {
    protected ArrayList<ItemInterface> stock;
    private static final int ITEM_NOT_FOUND = -1;


    public Inventory() {
        stock = new ArrayList<>();
    }

    public Inventory(ArrayList<ItemInterface> startingStock) {
        stock = startingStock;
    }

    /**
     * Create an Inventory that is a view of `copy`. The held "stock" of the resulting
     * Inventory will be references to the instances referred to by the `copy` constructor.
     * @param copy
     */
    public Inventory(Inventory copy) {
        stock = new ArrayList<>(copy.stock.size());
        for (ItemInterface item : copy.stock) {
            stock.add(item);
        }
    }

    public ArrayList<ItemInterface> getStock() {
        return stock;
    }

    /**
     * Adds an Item instance to the inventories stock.
     * Sort is called using the current/existing sort strategy.
     * @param item
     */
    public void addOne(ItemInterface item) {
        stock.add(item);
    }


    /**
     * Remove and return an item with a specified name.
     * @param itemName
     * @return An Item matching the `itemName`
     */
// Modifying the code:
 // Fix the : Magic Numbers **DONE**

 // I changed the -1 value to a constant that I created to represent items which aren't found. I created an exception to remove the null value.
 // Fix the : Null Return **DONE**
 

    public ItemInterface removeOne(String itemName) {   
        int removeFromIdx = indexOfItemByName(itemName);
        if (removeFromIdx == ITEM_NOT_FOUND) {
            throw new IllegalArgumentException("Item not found: " + itemName);
        }

        return stock.remove((int) removeFromIdx);
    }


    /**
     * Find the index of an item by name.
     * @param itemName
     */

// Modifying the code:
 // Fix the : Magic Numbers **UNDONE**
 // Fix the : Null Return **UNDONE**

 // added an exception that checks if the 
    private int indexOfItemByName(String itemName) {
        for (int i = 0; i < stock.size(); i++) {
            ItemInterface cur = stock.get(i);

            if (cur != null && cur.getInventoryTableRow() != null 
            && itemName.equals(cur.getInventoryTableRow().getColumnOne())) {
            return i;
        }
        }
        return ITEM_NOT_FOUND;
    }

}
