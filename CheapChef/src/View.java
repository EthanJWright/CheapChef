import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class View {
	Model user = new Model();
	Model database = new Model();
    private static Scanner scanner;

	public void beginInteraction(){
        while(true){
        		ArrayList<recipe> recipe_list = user.recommendedRecipes.getRecipes();
				System.out.println("Find Matching Recipes(R) or Search for Ingredients(I)?");
				scanner = new Scanner(System.in);
				String action = scanner.nextLine().toLowerCase();
        if(action.equals("r")){
					
        		if (!user.userIngredients.getIngredients().isEmpty()){
        			database.databaseRecipes.findRecipe(user);
        			if(!user.userIngredients.getRestricted().isEmpty()){
                		user.recommendedRecipes.removeRestrictedRecipe(user);
                		recipeView(recipe_list);
        			}
        			recipeView(recipe_list);
        		}
        		
        		else if(user.userIngredients.getIngredients().isEmpty()){
        			System.out.println("You haven't added any ingredients!");
        		}
			}
			  else{
        Boolean keepSearching = true;
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


        //get category name to work with
        System.out.println("Enter a category: "); 
        scanner = new Scanner(System.in);
        String category_name = scanner.nextLine().toLowerCase();

        // Set entire category as restricted?
        System.out.println("Restricted category?(Y/N); ");
        scanner = new Scanner(System.in);
        String restricted_category = scanner.nextLine().toLowerCase();
        // get ready to list ingredients in specific category
        // if restricted, fill restricted list
        if(restricted_category.equals("y")){
        	keepSearching = false;
        	System.out.println("setting category");
        	user.userIngredients.setRestrictedCategory(category_name, database, user);
        }
        else{
        ArrayList<ingredient> ingredient_list = database.databaseIngredients.getIngredients();
        for(Iterator<ingredient> iterate = ingredient_list.listIterator(); iterate.hasNext();){
        	ingredient a_p = iterate.next();
        	// If the category they chose is the category of the item
        	if(a_p.getCategory().equals(category_name)){
        		System.out.println(a_p.getIngredient());
        	}
        }
    }

 }         // end of category based search



        if(keepSearching.equals(true)){
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
        	user.userIngredients.restricted.add(user_input);

        }

        else{
        user.userIngredients.addIngredient(user_input);

}

        }

        }

 //       } // closing bracket for category search


        System.out.println("Your restricted ingredients are: ");
        ArrayList<ingredient> userRestricted = user.userIngredients.getRestricted();
		for (Iterator<ingredient> iter = userRestricted.listIterator(); iter.hasNext(); ) {
		    ingredient a = iter.next();
		    System.out.println(a.getIngredient());
		}

        System.out.println("Your ingredients are: ");
        ArrayList<ingredient> userIngredients = user.userIngredients.getIngredients();
		for (Iterator<ingredient> iter = userIngredients.listIterator(); iter.hasNext(); ) {

		    ingredient a = iter.next();
		    System.out.println(a.getIngredient());


        }
     }

	 }
	}
	
	public void recipeView(ArrayList<recipe> list){
		for (Iterator<recipe> iter = list.listIterator(); iter.hasNext();){
	    	recipe a = iter.next();
	    	System.out.println(a.getRecipeName());
		}
		}

}

	
