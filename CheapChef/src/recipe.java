
public class recipe {
	
	
	public String recipeName;
	ingredients recipeIngredientsKeys = new ingredients();
	public String recipeURL;
	
	
	
	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	
	public ingredients getRecipeIngredients() {
		return recipeIngredients;
	}
	public void setRecipeIngredients(ingredients recipeIngredients) {
		this.recipeIngredients = recipeIngredients;
	}
	
	public String getRecipeURL() {
		return recipeURL;
	}
	public void setRecipeURL(String recipeURL) {
		this.recipeURL = recipeURL;
	}
}
