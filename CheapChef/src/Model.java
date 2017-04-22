public class Model {
	SearchTemplate query = new SearchTemplate();
	ingredients userIngredients = new ingredients();
	ingredients databaseIngredients = new ingredients();
	ingredients restricted = new ingredients();
	
	
	int priceRange;
	
	public void setDatabaseIngredients(){
		ingredient adding1 = new ingredient();
		adding1.setIngredient("carrot");
		adding1.setPrice(1);
		databaseIngredients.addIngredient(adding1);
		
		ingredient adding2 = new ingredient();
		adding2.setIngredient("potato");
		adding2.setPrice(1);
		databaseIngredients.addIngredient(adding2);
		
		ingredient adding3 = new ingredient();
		adding3.setIngredient("beef");
		adding3.setPrice(5);
		databaseIngredients.addIngredient(adding3);
		
		ingredient adding4 = new ingredient();
		adding4.setIngredient("broth");
		adding4.setPrice(2);
		databaseIngredients.addIngredient(adding4);
		
		ingredient adding5 = new ingredient();
		adding5.setIngredient("bread");
		adding5.setPrice(2);
		databaseIngredients.addIngredient(adding5);
		
		ingredient adding6 = new ingredient();
		adding6.setIngredient("turkey");
		adding6.setPrice(5);
		databaseIngredients.addIngredient(adding6);
		
		ingredient adding7 = new ingredient();
		adding7.setIngredient("milk");
		adding7.setPrice(3);
		databaseIngredients.addIngredient(adding7);
		
		ingredient adding8 = new ingredient();
		adding8.setIngredient("cheese");
		adding8.setPrice(3);
		databaseIngredients.addIngredient(adding8);
		
		ingredient adding9 = new ingredient();
		adding9.setIngredient("wine");
		adding9.setPrice(8);
		databaseIngredients.addIngredient(adding9);
		
	}
	
}
