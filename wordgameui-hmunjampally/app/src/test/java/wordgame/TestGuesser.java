package wordgame;
import wordgame.model.Guesser;

public class TestGuesser implements Guesser{
   protected String wordToGuess;
   protected int nextGuessIndex = 0;

   public TestGuesser(String word){
      this.wordToGuess = word;
   }

   public char getNextGuess(){
      char result = ' ';
      if (nextGuessIndex < wordToGuess.length()){
         result = wordToGuess.charAt(nextGuessIndex);
         nextGuessIndex++;
      }
      return result;
   }
}
