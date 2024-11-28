package chat_gpt;


import java.util.Map;

class Recipe {
    private String name;
    private Map<String, Integer> ingredients;

    public Recipe(String name, Map<String, Integer> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getIngredients() {
        return ingredients;
    }
}