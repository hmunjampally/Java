public class Grocery {
   protected String name;
   protected int quantity;
   protected String units;
   public Grocery()
   {
    this.name = "null";
    this.quantity = 0;
    this.units = "null";
   }
   public Grocery(String name, String units, int quantity)
   {
    this.name = name;
    this.quantity = quantity;
    this.units = units;
   }

   String getName(){
    return this.name;
   }
   int getQuantity()
   {
    return this.quantity;
   }
   String getUnits(){
    return this.units;
   }

   public void use(int quantity)
   {
      this.quantity = quantity;
   }

   public String toString()
   {
    String val = "Grocery Name: " + name + "  ,  " + "Grocery quantity: " + quantity + "  ,  " + "Grocery units: " + units ;
    return val;
   }
}
