import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class View {
	Model user = new Model();
	Model database = new Model();
    private static Scanner scanner;
	
	public void beginInteraction(){
        while(true){
        System.out.println("Text(T) or Category(C) search?");
        scanner = new Scanner(System.in);
        String search_type = scanner.nextLine().toLowerCase();
        
        // If they chose to view categories
        ArrayList<ingredient> category_list = database.categories.getIngredients();
        if(search_type.equals("c")){
            for (Iterator<ingredient> iter = category_list.listIterator(); iter.hasNext();){
            	ingredient a = iter.next();
            	System.out.println(a.getCategory());  
            }
            	
        System.out.println("Enter a category: ");
        scanner = new Scanner(System.in);
        String category_name = scanner.nextLine().toLowerCase();
        // get ready to list ingredients in specific category 
        ArrayList<ingredient> ingredient_list = database.databaseIngredients.getIngredients();
        for(Iterator<ingredient> iterate = ingredient_list.listIterator(); iterate.hasNext();){
        	ingredient a_p = iterate.next();
        	// If the category they chose is the category of the item
        	if(a_p.getCategory().equals(category_name)){
        		System.out.println(a_p.getIngredient());
        	}
        }
            	
        
      }
        // end of category based search
            	
        System.out.println("Enter your item: ");
        scanner = new Scanner(System.in);
        String item = scanner.nextLine().toLowerCase();
        
        System.out.println("Is it an allergy?(Y/N): ");
     
        scanner = new Scanner(System.in);
        String restrict = scanner.nextLine().toLowerCase();
        
        
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
