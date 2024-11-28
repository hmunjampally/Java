package wordgame.model;

import java.util.ArrayList;

import wordgame.Observer;

public class SecretWord
{
   private char    []secret;
   private char    []originalWord;
   private boolean []opened;

   private ArrayList<Observer> observers = new ArrayList<Observer>();
   private int incorrectGuesses = 5;

   public SecretWord(String word)
   {
      this.secret = word.toLowerCase().toCharArray();
      this.originalWord = word.toCharArray();
      this.opened = new boolean[secret.length];
   }

   public boolean makeGuess(char letter)
   {
      boolean result = false;
      letter = Character.toLowerCase(letter);

      for (int i = 0; i < this.secret.length; i++)
      {
         if (this.secret[i] == letter && !this.opened[i])
         {
            result = true;
            this.opened[i] = true;

         }
      }
      if (!result) {
         this.incorrectGuesses--;
     }
     notifyObservers();
     return result;
   }

   public boolean hasUnopenedLetters()
   {
      for (int i = 0; i < this.opened.length; i++)
      {
         if (!this.opened[i])
         {
            return true;
         }
      }
      return false;
   }

   public String getCurrentGuess()
   {
      String result = "";
      for (int i = 0; i < this.opened.length; i++)
      {
         if (this.opened[i])
         {
            result+=this.originalWord[i];
         }
         else
         {
            result+='_';
         }
      }
      return result;
   }

   public String reveal()
   {
      String result = new String(this.originalWord);
      return result;
   }

   public int getLength()
   {
      int size = this.secret.length;
      return size;
   }


   public void register(Observer observer)
   {
      observers.add(observer);
   }

   public void notifyObservers()
   {
      for(Observer observer: observers)
      {
         observer.update();
      }

   }

   public int getIncorrectGuess()
   {
      return this.incorrectGuesses;
   }

   public boolean isGameOver() {
      return incorrectGuesses <= 0 || !hasUnopenedLetters();
  }

  public void decrementIncorrectGuesses() {
   incorrectGuesses--;
   notifyObservers();
}

}
