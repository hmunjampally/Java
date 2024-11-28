package chat_gpt;

import java.util.HashMap;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {
        Pantry pantry = new Pantry();

        // Adding groceries to the pantry
        pantry.addGrocery("Eggs", 12);
        pantry.addGrocery("Milk", 2);
        pantry.addGrocery("Flour", 5);

        // Creating recipes
        Map<String, Integer> omeletteIngredients = new HashMap<>();
        omeletteIngredients.put("Eggs", 2);
        omeletteIngredients.put("Milk", 1);
        Recipe omeletteRecipe = new Recipe("Omelette", omeletteIngredients);

        Map<String, Integer> pancakesIngredients = new HashMap<>();
        pancakesIngredients.put("Eggs", 1);
        pancakesIngredients.put("Milk", 1);
        pancakesIngredients.put("Flour", 1);
        Recipe pancakesRecipe = new Recipe("Pancakes", pancakesIngredients);

        // Checking and cooking recipes
        pantry.listGroceries();
        pantry.cookRecipe(omeletteRecipe);
        pantry.cookRecipe(pancakesRecipe);
        pantry.listGroceries();
    }
}
