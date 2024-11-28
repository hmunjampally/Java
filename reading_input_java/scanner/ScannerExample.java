import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample
{
   public static void main(String []args)
   {
      File inputFile = new File("input.txt");
      Scanner scanner;
      try
      {
         scanner = new Scanner(inputFile);
         while (scanner.hasNextLine())
         { 
            String nextLine = scanner.nextLine();
            System.out.println(nextLine);
         }
      }
      catch (FileNotFoundException error)
      {
         System.out.println("ERROR " + error.getMessage());
      }
   }
}
