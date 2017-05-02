import java.util.HashSet;
import java.util.Set;

public class recipe {
	
	
	public String recipeName;
	ingredients recipeIngredients = new ingredients();
	public Set<Integer> recipeIngredientKeys = new HashSet<Integer>();
	public String recipeURL;
	public int recipePrice;
	
	public Boolean containsIngredient(ingredient ingredient){
			for (Integer recipeKey : recipeIngredientKeys){
				if(recipeKey == ingredient.getKey()){
					return true;
				}
			}
			return false;
		}
			
		

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
	

	public Set<Integer> getRecipeIngredientKeys() {
		return recipeIngredientKeys;
	}

	public void setRecipeIngredientKeys(Set<Integer> recipeIngredientKeys) {
		this.recipeIngredientKeys = recipeIngredientKeys;
	}

	public String getRecipeURL() {
		return recipeURL;
	}
	
	public void setRecipeURL(String recipeURL) {
		this.recipeURL = recipeURL;
	}
	
	public int getRecipePrice() {
		return recipePrice;
	}
	
	public void setRecipePrice(int recipePrice) {
		this.recipePrice = recipePrice;
	}
	
}
