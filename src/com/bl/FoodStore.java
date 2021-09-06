package com.bl;

import java.util.ArrayList;
import java.util.List;

 //data layer//model layer
public class FoodStore implements foodMethodInterface{
	private List<FoodItem> foodList = new ArrayList();
 
	public void add(FoodItem foodItem) {
		foodList.add(foodItem);
	}
	
	public List<FoodItem> getFoodList() {
		return foodList;
	}
	
	public void remove(FoodItem foodItem) {
		foodList.remove(foodItem);
	}
	
	public FoodItem getFood (String foodName) {
		for (FoodItem foodItem : foodList ){
			if(foodName.equals(foodItem.name)) {
				return foodItem;
			}
		}
		return null;
	} 
}
