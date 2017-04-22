public class Model {
	SearchTemplate query = new SearchTemplate();
	ingredients userIngredients = new ingredients();
	ingredients databaseIngredients = new ingredients();
	ingredients restricted = new ingredients();
	int priceRange;
	
	public void setDatabaseIngredients(){
		ingredient adding1 = new ingredient();
		adding1.setIngredient("carrot");
		databaseIngredients.addIngredient(adding1);
		
		ingredient adding2 = new ingredient();
		adding2.setIngredient("potato");
		databaseIngredients.addIngredient(adding2);
		
		ingredient adding3 = new ingredient();
		adding3.setIngredient("beef");
		databaseIngredients.addIngredient(adding3);
		
		ingredient adding4 = new ingredient();
		adding4.setIngredient("broth");
		databaseIngredients.addIngredient(adding4);
		
		ingredient adding5 = new ingredient();
		adding5.setIngredient("bread");
		databaseIngredients.addIngredient(adding5);
		
		ingredient adding6 = new ingredient();
		adding6.setIngredient("turkey");
		databaseIngredients.addIngredient(adding6);
		
		ingredient adding7 = new ingredient();
		adding7.setIngredient("milk");
		databaseIngredients.addIngredient(adding7);
		
		ingredient adding8 = new ingredient();
		adding8.setIngredient("cheese");
		databaseIngredients.addIngredient(adding8);
		
		ingredient adding9 = new ingredient();
		adding9.setIngredient("wine");
		databaseIngredients.addIngredient(adding9);
		
	}
	
}
