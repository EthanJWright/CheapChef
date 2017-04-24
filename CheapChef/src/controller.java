import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class controller {
    private static Scanner scanner;

	public static void main(String[] args) {
		Model database = new Model();
		Model user = new Model();
		
	    System.out.println("here");
	    final CassandraInterface client = new CassandraInterface();
	    System.out.println("here");


        database.databaseIngredients = client.getIngredients();
        database.categories = client.getCategories();
        
        
 
        
        client.close();
		
		
/* Cassandra interface     -  - - - ---------------------------*/		
		
        while(true){
        System.out.println("Enter your item: ");
        scanner = new Scanner(System.in);
        String item = scanner.nextLine().toLowerCase();
        
        System.out.println("Is it an allergy?(Y/N): ");
     
        scanner = new Scanner(System.in);
        String restrict = scanner.nextLine().toLowerCase();
        
        System.out.println("Select by category?(Y/N): ");
        
        scanner = new Scanner(System.in);
        String choose_category = scanner.nextLine().toLowerCase();
        ArrayList<ingredient> category_list = database.categories.getIngredients();
        if(choose_category.equals("y")){
        	for (Iterator<ingredient> iter = category_list.listIterator(); iter.hasNext();){
        		ingredient a = iter.next();
        		System.out.println(a.getCategory());
        				
        	}

        }
        
        ingredient user_input = database.query.findIngredient(item, database);

        if(user_input == null){
        	System.out.println("Ingredient not in system");
        }
        else{
        if(restrict.equals("y")){
        	user.restricted.addIngredient(user_input);
        	
            System.out.println("Your restricted ingredients are: ");
            ArrayList<ingredient> userRestricted = user.restricted.getIngredients();      
    		for (Iterator<ingredient> iter = userRestricted.listIterator(); iter.hasNext(); ) {		
    		    ingredient a = iter.next();
    		    System.out.println(a.getIngredient());
    		}
        }
        else{
        user.userIngredients.addIngredient(user_input);
        
        System.out.println("Your ingredients are: ");
        ArrayList<ingredient> userIngredients = user.userIngredients.getIngredients();      
		for (Iterator<ingredient> iter = userIngredients.listIterator(); iter.hasNext(); ) {
			
		    ingredient a = iter.next();
		    System.out.println(a.getIngredient());
		}
		

       
        }
        }
     }
       
    }

}
