package inventory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Item;
import model.ItemManager;

public class TestItemManager {
	
	ItemManager itemManager = new ItemManager();
	Item item = new Item();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAddSupply() {
		item.setQuantityOnHand(10);
		itemManager.addSupply(10, item);
		assertEquals(20, item.getQuantityOnHand(), 0.0);
	}
	
	@Test
	public void testCostOfOrder() {
		item.setCostPerUnit(5);
		double cost = itemManager.costOfOrder(10, item);
		assertEquals(50, cost, 0.0);
	}
	
	@Test
	public void testItemDoesHaveSupply() {
		item.setQuantityOnHand(5);
		assertTrue(itemManager.haveSupply(item));
	}
	
	@Test
	public void testItemDoesNotHaveSupply() {
		item.setQuantityOnHand(0);
		assertFalse(itemManager.haveSupply(item));
	}

}
