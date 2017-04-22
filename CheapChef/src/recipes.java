import java.util.ArrayList;

public class recipes {
	ArrayList<recipe> databaseRecipes = new ArrayList<recipe>();
	ArrayList<recipe> userRecipes = new ArrayList<recipe>();
	public int price;
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
