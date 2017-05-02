
public class recipe {
	
	
	public String recipeName;
	ingredients recipeIngredients = new ingredients();
	public String recipeURL;
	public int recipePrice;
	
	
	
	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}	
	public String getRecipeURL() {
		return recipeURL;
	}
	public void setRecipeURL(String recipeURL) {
		this.recipeURL = recipeURL;
	}
	public ingredients getRecipeIngredients() {
		return recipeIngredients;
	}
	public void setRecipeIngredients(ingredients recipeIngredientsKeys) {
		this.recipeIngredients = recipeIngredientsKeys;
	}

	public int getRecipePrice() {
		return recipePrice;
	}
	public void setRecipePrice(int recipePrice) {
		this.recipePrice = recipePrice;
	}
	
}
