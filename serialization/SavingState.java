import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SavingState
{
   public static void main(String []args)
   {
      Point2D point = new Point2D(10, 15);
      System.out.println(point);

      try
      {
         FileOutputStream fileOut = new FileOutputStream("point.dat");
         ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
         objectOut.writeObject(point);
         objectOut.close();
         fileOut.close();
      }
      catch (IOException error)
      {
         System.out.println(error.getMessage());
      }
   }
}
