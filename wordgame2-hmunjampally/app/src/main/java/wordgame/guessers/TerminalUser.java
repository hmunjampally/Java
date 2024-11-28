package wordgame.guessers;

import wordgame.model.Guesser;
//import wordgame.model.SecretWord;

import java.util.Scanner;

public class TerminalUser implements Guesser{
   protected Scanner nextScanner;

   public TerminalUser(){
      nextScanner = new Scanner(System.in);
   }

   @Override
   public char getNextGuess(){
      return nextScanner.next().charAt(0);      
   }
}
