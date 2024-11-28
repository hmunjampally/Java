
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver {
    public static void main(String []args)
    {
        if(args.length<1)
        {
            System.out.println("Enter the file name to the command line");
        }
        File data = new File(args[0]);
        Scanner scan;
       try{
        scan = new Scanner(data);
        while(scan.hasNextLine()){
            String nextLine = scan.nextLine();
             String[] items = nextLine.split(",");
             for (int i = 0; i < items.length; i++) {
                items[i] = items[i].trim();
            }
            
            if (items.length==3){
            String val1 = items[0];
            String val2 = items[1];
            int val3 = Integer.parseInt(items[2]);
            Grocery groc = new Grocery(val1,val2,val3);
            Pantry pantry = new Pantry();
            pantry.add(groc);
            ArrayList<Grocery> pantryItems = pantry.listGroceries();
        System.out.println("Groceries in the pantry:");
        for (Grocery item : pantryItems) {
            System.out.println(item.toString());
        }
        ArrayList<Grocery> recipe = new ArrayList<>();
        recipe.add(new Grocery("Apple", "pieces",2));
        recipe.add(new Grocery("Milk", "liters",1));
        recipe.add(new Grocery("Cheese", "block",1));

        // Check if there are enough groceries for the recipe
        boolean hasEnoughIngredients = pantry.hasEnoughForRecipe(recipe);
        if (hasEnoughIngredients) {
            System.out.println("There are enough ingredients in the pantry for the recipe.");
        } else {
            System.out.println("Not enough ingredients in the pantry for the recipe.");
        }
        }
    
       }
    }
       catch(FileNotFoundException error)
       {
          System.out.println("ERROR " + error.getMessage());
       }
    }
}
    
      /* 
            if (items.length==4){
            String val1 = items[0];
            String val2 = items[1];
            String val3 = items[2];
            String val4 = items[3];
            }*/
 /* 
  public static void main(String[] args) {
    // Create some grocery items
    Grocery apple = new Grocery("Apple", "pieces",5);
    Grocery milk = new Grocery("Milk", "liters",2);
    GregorianCalendar appleExpiration = new GregorianCalendar(2023, 10, 15); 
    PerishableGrocery cheese = new PerishableGrocery("Cheese", "block", 1,appleExpiration);

    // Create a pantry and add groceries to it
    Pantry pantry = new Pantry();
    pantry.add(apple);
    pantry.add(milk);
    pantry.add(cheese);

    ArrayList<Grocery> pantryItems = pantry.listGroceries();
        System.out.println("Groceries in the pantry:");
        for (Grocery item : pantryItems) {
            System.out.println(item.toString());
        }
        ArrayList<Grocery> recipe = new ArrayList<>();
        recipe.add(new Grocery("Apple", "pieces",2));
        recipe.add(new Grocery("Milk", "liters",1));
        recipe.add(new Grocery("Cheese", "block",1));

        // Check if there are enough groceries for the recipe
        boolean hasEnoughIngredients = pantry.hasEnoughForRecipe(recipe);
        if (hasEnoughIngredients) {
            System.out.println("There are enough ingredients in the pantry for the recipe.");
        } else {
            System.out.println("Not enough ingredients in the pantry for the recipe.");
        }
  }
}


    

 */