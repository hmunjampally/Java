package chat_gpt;

import java.util.HashMap;
import java.util.Map;

class Pantry {
    private Map<String, Grocery> groceries;

    public Pantry() {
        this.groceries = new HashMap<>();
    }

    public void addGrocery(String name, int quantity) {
        if (groceries.containsKey(name)) {
            Grocery existingGrocery = groceries.get(name);
            existingGrocery.setQuantity(existingGrocery.getQuantity() + quantity);
        } else {
            Grocery newGrocery = new Grocery(name, quantity);
            groceries.put(name, newGrocery);
        }
    }

    public boolean hasIngredientsForRecipe(Recipe recipe) {
        for (Map.Entry<String, Integer> entry : recipe.getIngredients().entrySet()) {
            String ingredientName = entry.getKey();
            int requiredQuantity = entry.getValue();
            
            if (!groceries.containsKey(ingredientName) || groceries.get(ingredientName).getQuantity() < requiredQuantity) {
                return false;
            }
        }
        return true;
    }

    public void cookRecipe(Recipe recipe) {
        if (hasIngredientsForRecipe(recipe)) {
            for (Map.Entry<String, Integer> entry : recipe.getIngredients().entrySet()) {
                String ingredientName = entry.getKey();
                int requiredQuantity = entry.getValue();
                Grocery grocery = groceries.get(ingredientName);
                grocery.setQuantity(grocery.getQuantity() - requiredQuantity);
            }
            System.out.println("Cooked " + recipe.getName());
        } else {
            System.out.println("Not enough ingredients to cook " + recipe.getName());
        }
    }

    public void listGroceries() {
        System.out.println("Groceries in the pantry:");
        for (Grocery grocery : groceries.values()) {
            System.out.println(grocery.getName() + ": " + grocery.getQuantity());
        }
    }
}

