package com.bl;

import com.bl.FoodItem.Category;
import com.bl.FoodItem.Taste;
import com.bl.FoodItem.VegType;

public class IndianCuisine extends FoodItem {
	IndianCuisine(){
		taste = Taste.SPICY;
		category = Category.MAINCOURSE;
		vegType =VegType.VEG;
		name = "Indian Cuisine";
	}
}