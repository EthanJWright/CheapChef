public class Model {
	SearchTemplate query = new SearchTemplate();
	ingredients userIngredients = new ingredients();
	ingredients databaseIngredients = new ingredients();
	ingredients restricted = new ingredients();
	ingredients categories = new ingredients();
	// need to implement Recipes into database
	recipes databaseRecipes = new recipes();
	recipes recommendedRecipes = new recipes();
	
	
	
	public ingredients getCategories() {
		return categories;
	}

	public void setCategories(ingredients categories) {
		this.categories = categories;
	}

	int priceRange;
	
	
}
