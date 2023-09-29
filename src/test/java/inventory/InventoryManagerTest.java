package inventory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryManagerTest {

    @Test
    void testAddAndRemoveItem() {
        InventoryManager manager = new InventoryManager();
        manager.addItem("Widget", 10);
        assertTrue(manager.removeItem("Widget", 5));
        assertEquals(5, manager.getItemCount("Widget"));
    }

    // TODO: Add at least three more tests
}
