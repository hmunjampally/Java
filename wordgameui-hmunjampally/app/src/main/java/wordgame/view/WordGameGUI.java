package wordgame.view;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import wordgame.model.SecretWord;
import wordgame.ControllerInterface;
import wordgame.Observer;


public class WordGameGUI implements ActionListener, Observer
{
   private JFrame mainFrame;
   private JPanel mainPanel;
   private LetterButtons buttons;
   
   JLabel allowedGuesses;
   private JLabel wordLabel;

   ControllerInterface control;
   SecretWord secretWord;

   
   public WordGameGUI(ControllerInterface control, SecretWord secretWord)
   {
      this.control = control;
      this.secretWord = secretWord;
   
      this.secretWord.register(this);
      StringBuilder unOpenedWord = new StringBuilder("");
      for (int i=0; i< secretWord.getLength();i++)
      {
         unOpenedWord.append("_ ");
      }

      wordLabel = new JLabel(unOpenedWord.toString());
      wordLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

      JFrame mainFrame = new JFrame("Word Game");
      mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      mainPanel = new JPanel();
      mainPanel.setBackground(new Color(171, 229, 245));
      mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
      mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
      mainPanel.add(wordLabel);

      buttons = new LetterButtons(this); // passing 'this' object as the ActionListener

      buttons.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
      buttons.setOpaque(false);

      allowedGuesses = new JLabel("Allowed Incorrect Guesses: "+secretWord.getIncorrectGuess());
      allowedGuesses.setAlignmentX(Component.CENTER_ALIGNMENT);
      
      mainPanel.add(buttons);
      mainPanel.add(allowedGuesses);
      mainFrame.add(mainPanel);

      mainFrame.pack();
      mainFrame.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent event)
   {
      // get the source component that triggered this event
      // and cast it to a JButton
      JButton button = (JButton)event.getSource();
      String text = button.getText();
      char letter = text.charAt(0);
      System.out.println("User selected "+letter);

      // TODO: tell the controller about the user's choice
      
      boolean correctGuess = this.control.userChoice(letter);

    if (correctGuess) {
      String currentGuess = secretWord.getCurrentGuess();
      wordLabel.setText(currentGuess);
    }
      button.setEnabled(false);
   }

   @Override
   public void update()
   {  
      String currentGuess = secretWord.getCurrentGuess();
      wordLabel.setText(currentGuess);

        if (secretWord.isGameOver()) {
            if (!secretWord.hasUnopenedLetters()) 
            {                  
               
               System.out.println("Congratulations, you revealed the hidden word: " + secretWord.reveal());
               wordLabel.setText("Congratulations, you revealed the hidden word: " + secretWord.reveal());
            } 
            else {
               wordLabel.setText("Sorry, you lost. The word was: " + secretWord.reveal());
            }
            buttons.disableAllButtons();
        }
        allowedGuesses.setText("Allowed Incorrect Guesses: " + secretWord.getIncorrectGuess());
        
      }
      
}
