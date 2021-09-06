package com.bl;

import com.bl.FoodItem.Category;
import com.bl.FoodItem.Taste;
import com.bl.FoodItem.VegType;

public class ChineseCuisine extends FoodItem {
	ChineseCuisine(){
		taste = Taste.SPICY;
		category = Category.MAINCOURSE;
		vegType =VegType.NON_VEG;
	     name = "Chinese Cuisine";
	}
}
