/*
import java.util.ArrayList;
import java.util.Iterator;

public class recipes {


	ArrayList<recipe> recipes = new ArrayList<recipe>();
	ArrayList<recipe> recommendRecipes = new ArrayList<recipe>();
	public int totalPrice;
	
	public void addRecipe(recipe adding, Model database){
		
		ArrayList<recipe> list = database.databaseRecipes.getRecipes();
		for (int i = 0; i < list.size(); i++) {
		if (adding.recipeName == list.get(i).recipeName){
			recipes.add(adding);
		}
		
		}
	}
	
	public void findRecipe(recipe recipe, Model database){
		ArrayList<ingredient> list = user.userIngredients.getIngredients();
		ArrayList<String> recipeList = new ArrayList<String>();


		for(Iterator<ingredient> iter = list.listIterator(); iter.hasNext();) {
			for(Iterator<recipe> iter2= databaseRecipes.listIterator(); iter2.hasNext();){ //gotta figure out a way to look into the ingredients of the database for the recipe
				ingredient a = iter.next();
				recipe b = iter2.next();
				if(a.ingredient.equals(b.recipeIngredients)){
					recipeList.add(b.recipeName);
				}
			}
		}
	}

	public recipe findRecipe(String find) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public ArrayList<recipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(ArrayList<recipe> recipes) {
		this.recipes = recipes;
	}

	public ArrayList<recipe> getRecommendRecipes() {
		return recommendRecipes;
	}

	public void setRecommendRecipes(ArrayList<recipe> recommendRecipes) {
		this.recommendRecipes = recommendRecipes;
	}
	
}

*/
