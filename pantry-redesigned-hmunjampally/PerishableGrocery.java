//import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class PerishableGrocery extends Grocery
{
    GregorianCalendar expiration_date;
    public PerishableGrocery()
    {
        super();
    }
    public PerishableGrocery(String name, String units, int quantity, GregorianCalendar date)
    {
        super(name,units,quantity);
        this.expiration_date = date; 
    }
    public GregorianCalendar getExpirationDate()
    {
        return expiration_date;
    }
    @Override
    public int getQuantity()
    {
        GregorianCalendar today = new GregorianCalendar();
        if (today.after(expiration_date))
        {
            return 0;
        }
        else{
            return super.getQuantity();
        }
    }
    
    @Override
    public String toString()
   {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String formattedDate = dateFormat.format(expiration_date.getTime());
    String val = super.toString() + "  ,  " + "Expiration Date: " + formattedDate ;
    return val;
}

}