package wordgame.controller;

import wordgame.ControllerInterface;
import wordgame.model.SecretWord;
import wordgame.view.WordGameGUI;

public class Controller implements ControllerInterface{
    WordGameGUI gui;
    SecretWord secretWord;

    public Controller(SecretWord secretWord)
    {
        this.secretWord = secretWord;
        this.gui = new WordGameGUI(this,secretWord);
        
    }

    public boolean userChoice(char letter) {
        boolean correctGuess = secretWord.makeGuess(letter);
        return correctGuess; 
    }

    
}

    