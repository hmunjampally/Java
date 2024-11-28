import java.util.ArrayList;

public class Pantry 
{
    ArrayList<Grocery> groceries;

    public Pantry()
    {
        groceries = new ArrayList<>();
    }
    public Pantry(ArrayList<Grocery> groceryList)
    {
        groceries = groceryList;
    }
    public ArrayList<Grocery> listGroceries()
    {
        return groceries;
    }

    public void add(Grocery grocery)
    {
        groceries.add(grocery);
    }

    public boolean hasEnoughForRecipe(ArrayList<Grocery> recipe)
    {
        for( Grocery item : recipe)
        {
            boolean found_item = false;
            for(Grocery pantryItem: groceries)
            {
                if(item.getName().equalsIgnoreCase(pantryItem.getName()))
                {
                    if(item.getQuantity() <= pantryItem.getQuantity())
                    {
                        found_item = true;
                        break;
                    } 
                }
            }
            if (!found_item)
            {
            return false;
            }
        }
        return true; 
    }
    public void useGroceries( ArrayList<Grocery> recipe)
    {
        for (Grocery item: recipe)
        {
            for (Grocery pantryItem: groceries)
            {
                if(item.getName().equalsIgnoreCase(pantryItem.getName()))
                {
                    int quantity_used = item.getQuantity();
                    pantryItem.use(quantity_used);
                    break;
                }
            }
        }
        
    }
}
    


