package com.bl;

import java.util.List;
import java.util.Scanner;

//view layer
public class UserInterface {
	public void print(List<FoodItem> foodList) {
		for (int i = 0; i < foodList.size(); i++) {
			System.out.println(foodList.get(i));
		}
	}
	
	public void showUserMenu() {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int exit = 4;
		Application application = new Application();
		
		while(n != exit) {
			System.out.println("Enter 1 for Adding food item ");
			System.out.println("Enter 2 for removing food item ");
			System.out.println("Enter 3 for printing food item ");
			System.out.println("Enter " + exit + " for Exit");
			n = sc.nextInt();
			
			application.handleUserSelection(n);
			}
		}
}
