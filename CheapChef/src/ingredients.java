import java.util.ArrayList;
import java.util.Iterator;


public class ingredients {
	ArrayList<ingredient> ingredients = new ArrayList<ingredient>();
	ArrayList<ingredient> restricted = new ArrayList<ingredient>();
	
	public ArrayList<ingredient> removeIngredient(ingredient removing){
		// remove the specified ingredient from the list (need ingredient object)
		
		ArrayList<ingredient> list = ingredients;
		if(list.isEmpty()){
			return null;
		}
		
		for (Iterator<ingredient> iter = list.listIterator(); iter.hasNext(); ) {
		    ingredient a = iter.next();
		    if (a == removing) {
		        iter.remove();
		    }
		}
		return ingredients;
	}
	
	public void addIngredient(ingredient adding){
		// add an ingredient to the list
		
		// if it is a dietary need add to restricted list
		if(adding.DietaryNeed == true){
			restricted.add(adding);
		}
		else{
			// otherwise add to user list
			ingredients.add(adding);
		}
	}
	
	public ingredient findIngredient(String searching){
	    ArrayList<ingredient> list = ingredients;
		for (Iterator<ingredient> iter = list.listIterator(); iter.hasNext(); ) {
		    ingredient a = iter.next();
		    if (a.ingredient.equals(searching)) {
		        return a;
		    
		    }		
	   	}
		return null;
	}
	
	public void setRestrictedCategory(String category, Model database, Model user){
		ArrayList<ingredient> list = database.databaseIngredients.getIngredients();
		for(Iterator<ingredient> iter = list.listIterator(); iter.hasNext();){
			ingredient a = iter.next();
			if(a.category.equals(category)){
				a.setDietaryNeed(true);
				System.out.println(a.getIngredient());
				restricted.add(a);
			}
		}
	}
	
	
	public ArrayList<ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(ArrayList<ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	public ArrayList<ingredient> getRestricted() {
		return restricted;
	}
	public void setRestricted(ArrayList<ingredient> restricted) {
		this.restricted = restricted;
	}
	
	
}
