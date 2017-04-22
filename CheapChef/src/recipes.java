import java.util.ArrayList;
import java.util.Iterator;

public class recipes {
	ArrayList<recipe> databaseRecipes = new ArrayList<recipe>();
	ArrayList<recipe> userRecipes = new ArrayList<recipe>();
	public int price;
	public void findRecipe(ArrayList<ingredient> ingredients){
	
		ArrayList<ingredient> list = ingredients;
		
		for (Iterator<ingredient> iter = list.listIterator(); iter.hasNext();) {
		    ingredient a = iter.next();
		    if (a == ingredients) {
		        iter.remove();
		    }
		}
	}
	public ArrayList<recipe> getDatabaseRecipes() {
		return databaseRecipes;
	}
	public void setDatabaseRecipes(ArrayList<recipe> databaseRecipes) {
		this.databaseRecipes = databaseRecipes;
	}
	public ArrayList<recipe> getUserRecipes() {
		return userRecipes;
	}
	public void setUserRecipes(ArrayList<recipe> userRecipes) {
		this.userRecipes = userRecipes;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
		
	 
	

}
