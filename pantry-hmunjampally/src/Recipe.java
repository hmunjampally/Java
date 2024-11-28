import java.util.List;

public class Recipe {
    String name;
    List<Grocery> ingredients;

    public Recipe(String name, List<Grocery> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }
}
