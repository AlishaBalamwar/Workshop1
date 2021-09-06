package com.bl;

public class FoodItem {
	enum Taste {SWEET, SOUR, SPICY, SWEET_SOUR};
	enum Category {STARTER, JUICES, MAINCOURSE, DESERTS};
	enum  VegType {VEG, NON_VEG};
	
	protected Taste taste;
	protected Category category;
	protected VegType vegType;
	private int price;
	protected String name;
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FoodItem [taste=" + taste + ", category=" + category + ", vegType=" + vegType + ", price=" + price
				+ ", name=" + name + "]";
	}
	
}
