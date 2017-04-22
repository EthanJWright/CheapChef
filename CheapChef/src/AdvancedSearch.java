
public class AdvancedSearch {
	public boolean DietaryNeed = false;
	
	public ingredient AdvancedFindIngredient(String name, int price, Model user){
		ingredient match = user.databaseIngredients.findIngredient(name);
		if(match.getPrice() > price){
			return null;
		}
		if(DietaryNeed == true){
			match.DietaryNeed = true;
		}
		return match;
	}

}
