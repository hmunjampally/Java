
import java.util.ArrayList;
import java.util.List;


class Pantry {
    List<Grocery> groceries;

    public Pantry() {
        groceries = new ArrayList<>();
    }

    public void addGrocery(Grocery grocery) {
        groceries.add(grocery);
    }

    public boolean checkRecipe(Recipe recipe) {
        for (Grocery ingredient : recipe.ingredients) {
            boolean found = false;
            for (Grocery grocery : groceries) {
                if (grocery.name.equals(ingredient.name) && grocery.quantity >= ingredient.quantity) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    public void adjustQuantities(Recipe recipe) {
        for (Grocery ingredient : recipe.ingredients) {
            for (Grocery grocery : groceries) {
                if (grocery.name.equals(ingredient.name)) {
                    grocery.quantity -= ingredient.quantity;
                    break;
                }
            }
        }
    }
}

