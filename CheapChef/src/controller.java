import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class controller {
    private static Scanner scanner;

	public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.
        Model user = new Model();
        
        

        ingredient userIngredient = new ingredient();
        userIngredient.setIngredient("carrot");
        user.databaseIngredients.addIngredient(userIngredient);
        
        user.setDatabaseIngredients();
        while(true){
        System.out.println("Enter your item: ");
        scanner = new Scanner(System.in);
        String item = scanner.nextLine().toLowerCase();
        
        System.out.println("Is it an allergy?(Y/N): ");
        scanner = new Scanner(System.in);
        String restrict = scanner.nextLine().toLowerCase();
        
        ingredient user_input = user.query.findIngredient(item, user);

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
