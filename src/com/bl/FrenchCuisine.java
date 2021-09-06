package com.bl;

import com.bl.FoodItem.Category;
import com.bl.FoodItem.Taste;
import com.bl.FoodItem.VegType;

public class FrenchCuisine extends FoodItem {
	FrenchCuisine(){
		taste = Taste.SWEET;
		category = Category.JUICES;
		vegType =VegType.VEG;
		name = "French Cuisine";
	}
}