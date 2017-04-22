public class controller {
    public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.
        ingredients ingredientList = new ingredients();
        ingredient testIngredient = new ingredient();
        testIngredient.setIngredient("carrot");
        ingredientList.addIngredient(testIngredient);
        ingredientList.addIngredient(testIngredient);
        ingredient carrot = ingredientList.getIngredients().get(0);
        System.out.println(carrot.getIngredient());
        
    }

}
