public class controller {
    public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.
        ingredients ingredientList = new ingredients();
        ingredient testIngredient = new ingredient();
        ingredient otherItem = new ingredient();
        testIngredient.setIngredient("carrot");
        otherItem.setIngredient("potato");
        ingredientList.addIngredient(testIngredient);
        ingredientList.addIngredient(otherItem);
        ingredient carrot = ingredientList.getIngredients().get(0);
        ingredient potato = ingredientList.getIngredients().get(1);
        System.out.println(carrot.getIngredient());
        System.out.println(potato.getIngredient());
        
    }

}
