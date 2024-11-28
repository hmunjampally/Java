
package wordgame.guessers;

import wordgame.guessers.RandomGuesser;
import java.util.Random;

import wordgame.model.Guesser;

//import wordgame.Guesser;

public class RandomGuesser implements Guesser {
    Random rand = new Random();

    @Override

    // to get the next guess randomly from alphabets only
    public char getNextGuess()
    {
        char x = (char) (rand.nextInt(26) + 'a');
        //System.out.printf("Enter your guess for",x);
        return x;
    }
}
