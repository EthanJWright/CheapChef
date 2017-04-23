import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;



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
			   tableResult.setDietaryNeed(row.getBool("ingredient_restricted"));
			   tableIngredients.addIngredient(tableResult);
		   }
		   return tableIngredients;
	   }
	   
	   /** Close cluster. */
	   public void close()
	   {
	      cluster.close();
	   }
}
