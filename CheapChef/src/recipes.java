/**
import java.util.ArrayList;
import java.util.Iterator;

public class recipes {
	ArrayList<recipe> databaseRecipes = new ArrayList<recipe>();
	ArrayList<recipe> userRecipes = new ArrayList<recipe>();
	public int totalPrice;
	
	
	public void findRecipe(ingredients userIngredients,Model user){
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
	


}
**/