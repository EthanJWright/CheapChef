import java.util.HashSet;
import java.util.Set;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.google.common.reflect.TypeToken;



public class CassandraInterface {
	   /** Cassandra Cluster. */
	   public Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
	   /** Cassandra Session. */
	   
	   public Session session = cluster.connect("cheapchef");
	   /**
	    * Connect to Cassandra Cluster specified by provided node IP
	    * address and port number.
	    *
	    * @param node Cluster node IP address.
	    * @param port Port of cluster host.
	    */
	   public void connect()
	   {
		    cluster = Cluster.builder()                                                    // (1)
		            .addContactPoint("127.0.0.1")
		            .build();

	   }

	   
	   public Session getSession()
	   {
	      return this.session;
	   }
	   
	   public ingredients getIngredients(){
		   ResultSet results = session.execute("SELECT * FROM ingredients");
		   ingredients tableIngredients = new ingredients();
		   for (Row row: results){
			   ingredient tableResult = new ingredient();
			   tableResult.setIngredient(row.getString("ingredient_name"));
			   tableResult.setPrice(row.getInt("ingredient_price"));
			   tableResult.setDietaryNeed(false);
			   tableResult.setCategory(row.getString("category"));
			   tableResult.setKey(row.getInt("ingredient"));
			   tableIngredients.addIngredient(tableResult);
		   }
		   return tableIngredients;
	   }
	   
	   public ingredients getCategories(){
		   ResultSet results = session.execute("SELECT * FROM categories");
		   ingredients categoryIngredients = new ingredients();
		   for (Row row: results){
			   ingredient category = new ingredient();
			   category.setIngredient(row.getString("ingredient_name"));
			   category.setPrice(row.getInt("ingredient_price"));
			   category.setCategory(row.getString("category"));
			   category.setDietaryNeed(false);
			   categoryIngredients.addIngredient(category);
		   }
		   return categoryIngredients;
	   }
	   // incomplete - need to figure out what to do with setRecipeIngredients
	   public recipes getRecipes(){
		   ResultSet results = session.execute("SELECT * FROM recipes");
		   recipes tableRecipes = new recipes();
		   for (Row row: results){
			   recipe tableResult = new recipe();
			   tableResult.setRecipeName(row.getString("recipe_name"));
			   tableResult.setRecipeIngredientKeys(row.getSet("ingredients", Integer.class));
			   tableResult.setRecipeURL(row.getString("recipe_url"));
			   tableRecipes.addRecipe(tableResult);
		   }
		   return tableRecipes;
	   }
	  
	   /** Close cluster. */
	   public void close()
	   {
	      cluster.close();
	   }
}
