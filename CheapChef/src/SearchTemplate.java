import java.util.ArrayList;

public class SearchTemplate {
	public String userInput;
	ArrayList<ingredient> results;
	public boolean searchText;
	public boolean searchCategory;

	public ingredient findIngredient(String find, Model user){
		ingredient match = user.databaseIngredients.findIngredient(find);	
		return match;
	}
}
