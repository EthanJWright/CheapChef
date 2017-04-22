import java.util.ArrayList;
import java.util.Iterator;


public class ingredients {
	ArrayList<ingredient> ingredients = new ArrayList<ingredient>();
	ArrayList<ingredient> restricted = new ArrayList<ingredient>();
	
	public ArrayList<ingredient> removeIngredient(ingredient removing){
		ArrayList<ingredient> list = ingredients;
		for (Iterator<ingredient> iter = list.listIterator(); iter.hasNext(); ) {
		    ingredient a = iter.next();
		    if (a == removing) {
		        iter.remove();
		    }
		}
		return ingredients;
	}
	
	public void addIngredient(ingredient adding){
		ingredients.add(adding);
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
