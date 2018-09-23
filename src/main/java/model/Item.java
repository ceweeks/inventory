package model;

public class Item {
	
	private String name;
	private int aisleNumber;
	private int quantityOnHand;
	private double costPerUnit;
	
	public Item() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAisleNumber() {
		return aisleNumber;
	}

	public void setAisleNumber(int aisleNumber) {
		this.aisleNumber = aisleNumber;
	}

	public int getQuantityOnHand() {
		return quantityOnHand;
	}

	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	public double getCostPerUnit() {
		return costPerUnit;
	}

	public void setCostPerUnit(double costPerUnit) {
		this.costPerUnit = costPerUnit;
	}
	
	

}
