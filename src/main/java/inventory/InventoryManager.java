package inventory;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {

    private Map<String, Integer> inventory = new HashMap<>();

    /**
     * Adds a specified quantity of an item to the inventory.
     *
     * @param item the name of the item
     * @param quantity the quantity to add
     */
    public void addItem(String item, int quantity) {
        // TODO: Implement this method

    }

    /**
     * Removes a specified quantity of an item from the inventory.
     *
     * @param item the name of the item
     * @param quantity the quantity to remove
     * @return true if the operation was successful, false otherwise (e.g., insufficient quantity)
     */
    public boolean removeItem(String item, int quantity) {
        // TODO: Implement this method
        return false;
    }

    /**
     * Retrieves the current quantity of an item in the inventory.
     *
     * @param item the name of the item
     * @return the quantity of the item
     */
    public int getItemCount(String item) {
        // TODO: Implement this method
        return 0;
    }
}

