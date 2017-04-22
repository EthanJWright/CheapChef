public class controller {
    public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.
        ingredients ingredientList = new ingredients();
        
        // Make some ingredients to add
        ingredient testIngredient = new ingredient();
        ingredient otherItem = new ingredient();
        
        // name the ingredients
        testIngredient.setIngredient("carrot");
        otherItem.setIngredient("potato");
        
        // put them both into our list of ingredients
        ingredientList.addIngredient(testIngredient);
        ingredientList.addIngredient(otherItem);
        
        // get ingredients from our list of ingredients
        ingredient carrot = ingredientList.getIngredients().get(0);
        ingredient potato = ingredientList.getIngredients().get(1);
        
        // print the ingredients
        System.out.println(carrot.getIngredient());
        System.out.println(potato.getIngredient());
        
    }

}
