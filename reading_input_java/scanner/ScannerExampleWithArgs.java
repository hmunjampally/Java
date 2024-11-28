import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExampleWithArgs
{
   public static void main(String []args)
   {
      if (args.length < 1) // args.length is the size of the args array
      { 
         System.out.println("Usage: java ScannerExampleWithArgs <INPUT_FILE>");
         return; // exit out of the program early
      }

      // use the file name provided with command line arguments
      File inputFile = new File(args[0]);
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
