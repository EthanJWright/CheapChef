
// not complete 

import java.util.ArrayList;
import java.util.Iterator;

public class recipes {


	ArrayList<recipe> recipes = new ArrayList<recipe>();
	//ArrayList<recipe> recommendRecipes = new ArrayList<recipe>();
	public int totalPrice;
	
	// goal: add recipes to recommendRecipes 
	
	
	
	public void addRecipe(recipe adding){		
			recipes.add(adding);
		}
	
		
	
	
	// goal: finding recipes based off matching userIngredient.keys
	// to database.ingredient.keys. Also checks for restricted ingredients
	
	public void findRecipe(Model user){
		ArrayList<recipe> list = recipes;
		for(Iterator<recipe> iter = list.listIterator(); iter.hasNext();){
			recipe a = iter.next();
			ArrayList<ingredient> userList = user.userIngredients.getIngredients();
			for(Iterator<ingredient> userIter = userList.listIterator(); userIter.hasNext();){
				ingredient b = userIter.next();
				if(a.containsIngredient(b)){
					user.recommendedRecipes.addRecipe(a);
				}
			}
		}

	}
	
	public void removeRestrictedRecipe(Model user){
		ArrayList<recipe> list = user.recommendedRecipes.getRecipes();
		for(Iterator<recipe> iter = list.listIterator(); iter.hasNext();){
			recipe a = iter.next();
			ArrayList<ingredient> userList = user.userIngredients.getRestricted();
			for(Iterator<ingredient> userIter = userList.listIterator(); userIter.hasNext();){
				ingredient b = userIter.next();
				if(a.containsIngredient(b)){
					iter.remove();
					break;
				}
			}
		}

	}

	
	
	public ArrayList<recipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(ArrayList<recipe> recipes) {
		this.recipes = recipes;
	}

	/*
	public ArrayList<recipe> getRecommendRecipes() {
		return recommendRecipes;
	}

	public void setRecommendRecipes(ArrayList<recipe> recommendRecipes) {
		this.recommendRecipes = recommendRecipes;
	}
	*/
}


