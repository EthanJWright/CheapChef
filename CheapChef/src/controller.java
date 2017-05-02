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
        System.out.println(database.databaseRecipes.getRecipes().get(0).getRecipeName());
        
 
        
        client.close();
		
		
/* Cassandra interface     -  - - - ---------------------------*/		
	  View interaction = new View();
	  interaction.database = database;
	  interaction.user = user;
	  interaction.beginInteraction();
       
    }

}
