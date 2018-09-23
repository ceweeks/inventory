package model;

public class ItemManager {
	
	public void addSupply(int quantity, Item item){
		int currentquantity = item.getQuantityOnHand();
		item.setQuantityOnHand(currentquantity + quantity);
	}
	
	public double costOfOrder(int quantityToAdd, Item item) {
		double cost = item.getCostPerUnit();
		return cost * quantityToAdd;
	}
	
	public void reduceSupply(int quantityToReduce, Item item) {
		int currentQuantity = item.getQuantityOnHand();
		if (quantityToReduce > currentQuantity) {
			System.out.println("Error. Not enough on hand.");
		} else {
			item.setQuantityOnHand(currentQuantity - quantityToReduce);
		}
	}
	
	public boolean haveSupply(Item item) {
		boolean supply = (item.getQuantityOnHand() > 0);
		return supply;
	}

}
