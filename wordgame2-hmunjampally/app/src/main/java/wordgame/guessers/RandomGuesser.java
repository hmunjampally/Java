package wordgame.guessers;

import wordgame.model.Guesser;
//import wordgame.model.SecretWord;
import java.util.Random;

public class RandomGuesser implements Guesser{
   protected Random randGuess = new Random();

   public char getNextGuess(){
      int nextLetterIndex = randGuess.nextInt(26);
      return (char)('a'+nextLetterIndex);
   }
}
