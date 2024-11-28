import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionExample
{
   public static void main(String []args)
   {
      // use the file name provided with command line arguments
      File inputFile = new File("someFile.txt");

      // This code does not compile because Scanner constructor is declared to throw a FileNotFoundException
      // FileNotFoundException is a checked exception and must be handled with either a try-catch block
      // or thrown to the next caller
      Scanner scanner = new Scanner(inputFile);
      while (scanner.hasNextLine())
      { 
         String nextLine = scanner.nextLine();
         System.out.println(nextLine);
      }
   }

}
