import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver
{
    public static void main(String []args)
    {
        if (args.length <1)
        {
            System.out .println("please input file name to the command line");
            return;
        }
        File filename = new File(args[0]);
        Scanner scanner;
        
        try
        {
            scanner = new Scanner(filename);
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
