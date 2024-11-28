
package wordgame;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

//import wordgame.guessers.RandomGuesser;
import wordgame.model.Guesser;
import wordgame.model.SecretWord;
import wordgame.guessers.TerminalUser;



public class App{

    private static String secret = "";
    static int errors = 3;
    static StringBuilder temp;
    static SecretWord secretWord;
    static ArrayList<String> secretWords = new ArrayList<>();
    static Random rand = new Random();

    public static void main(String []args){
        Guesser guessType;

        if (args.length < 1) // args.length is the size of the args array
        { 
            System.out.println("Enter file name to comand line");
            return; // exit out of the program early
        }

        File secretWords_text = new File(args[0]);
        Scanner scan;
        try
        {
            scan = new Scanner(secretWords_text);
            while (scan.hasNextLine())
            { 
                String nextWord = scan.nextLine();
                secretWords.add(nextWord);
                ///System.out.println(nextWord);
            }
        }
        catch (FileNotFoundException error)
        {
            System.out.println("ERROR " + error.getMessage());
        }

    
        guessType = new TerminalUser();
        

        int size = secretWords.size();
        int word_number = rand.nextInt(size);
        secret = secretWords.get(word_number);
        secretWord = new SecretWord(secret);
        Game game = new Game(secretWord,guessType);
        //temp = game.guessed_words;
        //game.setErrorLimit(errors);
        game.play();
        game.getResult();
          
    }
}