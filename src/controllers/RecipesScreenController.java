package controllers;

import data.RecipeRepository;
import models.Recipe;

public class RecipesScreenController {

	RecipeRepository recipeRepository = new RecipeRepository();
	
	public String createRecipe(String name, int price) {
		
		if (name.length() < 3) {
			return "El nombre de la receta es muy corto";
		}
		
		if (price < 1000) {
			return "Ninguna receta puede valer menos de $1.000";
		}
		if (price > 20000) {
			return "El valor de la receta es muy alto";
		}
		
		Recipe recipe = new Recipe(name, price);
		recipeRepository.create(recipe);
	
		
		return "Se creó la receta con éxito";
	}
	
}
