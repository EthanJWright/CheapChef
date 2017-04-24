public class Model {
	SearchTemplate query = new SearchTemplate();
	ingredients userIngredients = new ingredients();
	ingredients databaseIngredients = new ingredients();
	ingredients restricted = new ingredients();
	ingredients categories = new ingredients();
	
	
	public ingredients getCategories() {
		return categories;
	}

	public void setCategories(ingredients categories) {
		this.categories = categories;
	}

	int priceRange;
	
	
}
