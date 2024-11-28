import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class LoadingState
{
   public static void main(String []args)
   {
      try
      {
         FileInputStream fileIn = new FileInputStream("point.dat");
         ObjectInputStream objectIn = new ObjectInputStream(fileIn);
         Point2D point = (Point2D)objectIn.readObject();
         objectIn.close();
         fileIn.close();
         System.out.println(point);
      }
      catch(Exception error)
      {
         System.out.println(error.getMessage());
      }
   }
}
