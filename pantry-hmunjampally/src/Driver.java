

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        // Create some groceries
        List<Grocery> groceries = new ArrayList<>();
        groceries.add(new Grocery("Eggs", 12));
        groceries.add(new Grocery("Milk", 2));
        groceries.add(new Grocery("Flour", 5));
        groceries.add(new Grocery("Sugar", 3));
        groceries.add(new Grocery("Salt", 1));

        // Create a pantry and add groceries
        Pantry pantry = new Pantry();
        for (Grocery grocery : groceries) {
            pantry.addGrocery(grocery);
        }

        // Create a recipe
        List<Grocery> pancakeIngredients = new ArrayList<>();
        pancakeIngredients.add(new Grocery("Eggs", 2));
        pancakeIngredients.add(new Grocery("Milk", 1));
        pancakeIngredients.add(new Grocery("Flour", 1));
        pancakeIngredients.add(new Grocery("Sugar", 1));
        pancakeIngredients.add(new Grocery("Salt", 1));

        Recipe pancakeRecipe = new Recipe("Pancakes", pancakeIngredients);

        // Check if there are enough groceries for the recipe
        if (pantry.checkRecipe(pancakeRecipe)) {
            System.out.println("You have enough groceries to make pancakes!");
            pantry.adjustQuantities(pancakeRecipe);
            System.out.println("Grocery quantities adjusted after cooking.");
        } else {
            System.out.println("You don't have enough groceries to make pancakes.");
        }

        // Print updated grocery quantities
        System.out.println("Updated grocery quantities:");
        for (Grocery grocery : pantry.groceries) {
            System.out.println(grocery.name + ": " + grocery.quantity);
        }
    }
}
