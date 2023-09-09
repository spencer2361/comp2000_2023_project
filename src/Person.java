public class Person {
   public String name;
   public Inventory inventory;

   public Person(String personName, Inventory startingInventory) {
    name = personName;
    inventory = startingInventory;
}

public void addItem(ItemInterface item) {
    inventory.addOne(item);
}

public ItemInterface removeItem(String itemName) {
    return inventory.removeOne(itemName);
}

public Inventory getInventory() {
    return inventory;
}

public String getName() {
    return name;
}

}
