package com.bl;

import java.util.Scanner;

//controller layer
public class Application {
	FoodStore foodstore = new FoodStore();
	
	public static void main(String[] args) {
		/*ChineseCuisine chineseCuisine = new ChineseCuisine();
		chineseCuisine.setPrice(100);
		FrenchCuisine frenchCuisine = new FrenchCuisine();
		frenchCuisine.setPrice(200);
		IndianCuisine indianCuisine = new IndianCuisine();
		indianCuisine.setPrice(300);
		ItalianCuisine italianCuisine = new ItalianCuisine();
		italianCuisine.setPrice(400);
		
		FoodStore foodStore=new FoodStore();
		
		foodStore.add(chineseCuisine);
		foodStore.add(indianCuisine);
		foodStore.add(italianCuisine);
		foodStore.add(frenchCuisine);
		
		UserInterface userInterface = new UserInterface();
		userInterface.print(foodStore.getFoodList());
	
		foodStore.remove(chineseCuisine);
		foodStore.remove(indianCuisine);
		
		System.out.println("After removing items:");
		userInterface.print(foodStore.getFoodList());*/
		
		UserInterface userInterface = new UserInterface();
		userInterface.showUserMenu();
	}
		public void handleUserSelection(int n) {
			switch(n) {
			case 1:
				ChineseCuisine chineseCuisine = new ChineseCuisine();
				chineseCuisine.setPrice(100);
				FrenchCuisine frenchCuisine = new FrenchCuisine();
				frenchCuisine.setPrice(200);
				IndianCuisine indianCuisine = new IndianCuisine();
				indianCuisine.setPrice(300);
				ItalianCuisine italianCuisine = new ItalianCuisine();
				italianCuisine.setPrice(400);
				
				foodstore.add(chineseCuisine);
				foodstore.add(indianCuisine);
				foodstore.add(italianCuisine);
				foodstore.add(frenchCuisine);
				
				UserInterface userInterface = new UserInterface();
				userInterface.print(foodstore.getFoodList());
				break;
				
			case 2:
				System.out.println("Enter names of food item to be removed:");
				Scanner sc = new Scanner(System.in);
				String foodName = sc.nextLine();
				FoodItem foodItem = foodstore.getFood(foodName);
				foodstore.remove(foodItem);
				break;
				
			case 3:
				break;
			case 4:
				break;
		}
	}
}
