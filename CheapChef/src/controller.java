public class controller {


	public static void main(String[] args) {
		Model database = new Model();
		Model user = new Model();
		
	    System.out.println("here");
	    final CassandraInterface client = new CassandraInterface();
	    System.out.println("here");


        database.databaseIngredients = client.getIngredients();
        database.categories = client.getCategories();
        database.databaseRecipes = client.getRecipes();
        /*
        System.out.println(database.databaseRecipes.getRecipes().get(0).getRecipeName());
        System.out.println(database.databaseRecipes.getRecipes().get(1).getRecipeName());
     */   
        ingredient testingredient = database.databaseIngredients.findIngredient("couscous");
        ingredient testMoreIngredient = database.databaseIngredients.findIngredient("garlic");
        user.userIngredients.addIngredient(testingredient);
        user.userIngredients.addIngredient(testMoreIngredient);
        database.databaseRecipes.findRecipe(user);
        user.recommendedRecipes.removeRestrictedRecipe(user);
    //    recipe testRecipe = new recipe();
       // testRecipe = database.databaseRecipes.getRecipes().get(0);
        System.out.println(user.recommendedRecipes.getRecipes().get(0).getRecipeName());
  //      System.out.println(database.databaseRecipes.getRecipes().get(1).getRecipeName());
   //     System.out.println(database.databaseRecipes.getRecipes().get(2).getRecipeName());

        
        client.close();
		
		
/* Cassandra interface     -  - - - ---------------------------*/		
	  View interaction = new View();
	  interaction.database = database;
	  interaction.user = user;
	  interaction.beginInteraction();
       
    }

}
