public class ItemReader {
    private static final int DEF_EXPIRATION= -1;
	/**
	 * itemData format: {ITEM NAME}, {DESCRIPTION}, {VALUE}, {EXPIRATION IF EXPIRES}
	 * index:                0             1           2               3
	 *
	 * Each field is extracted for you to use.
	 *
	 * This method creates all of the starting items (for the player and store).
	 * @param itemData
	 * @return The read in Item
	 */
    public static ItemInterface readStartingItem(String[] itemData) {
        String name = itemData[0].trim();                      // DO NOT MODIFY
        String description = itemData[1].trim();               // DO NOT MODIFY
        double value = Double.valueOf(itemData[2].trim());     // DO NOT MODIFY
        String expiry = itemData[3].trim();                    // DO NOT MODIFY
        // NOTE: expiry will be an empty String if the item does not expire
        
        // You may modify the below
        
        // Modifying the code:
        // Fix the : Magic Numbers **DONE**
// I have used the final keyword to created a constant integer, with a meaninigful name, allowing me
//  to change expiration in a  single place in the future if needed.

 // Fix the : Null Return **DONE**
 // I have thrown an  Illegal Argumention Exeception in the case that an item which isn't listed is found.


        int expiration = DEF_EXPIRATION;
        
        if (!expiry.isEmpty()) {
            expiration = Integer.valueOf(expiry);
        }
        if (name.equals("Tomato")) {
            return new Tomato(expiration);
        } else if (name.equals("Rock")) {
            return new Rock(expiration);
        } else if (name.equals("Wand")) {
            return new Wand(expiration);
        } else {
           throw new IllegalArgumentException("Unknown Item:"+name);
        }
    }
}
