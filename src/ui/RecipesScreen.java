package ui;

import java.util.Scanner;

import controllers.RecipesScreenController;

public class RecipesScreen {
	
	RecipesScreenController recipesScreenController = new RecipesScreenController();
	
	public void createRecipe() {
		
		String name;
		int price;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-------- Creación de receta --------");
		System.out.println("Digite el nombre de la receta");
		name = sc.nextLine();
		System.out.println("Digite el precio de la receta");
		price = Integer.parseInt(sc.nextLine());
		
		String result = recipesScreenController.createRecipe(name, price);
		System.out.println(result);
		
		
	}

}
