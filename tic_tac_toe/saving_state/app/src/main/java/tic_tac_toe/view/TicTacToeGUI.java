package tic_tac_toe.view;

import tic_tac_toe.ControllerInterface;
import tic_tac_toe.GameObserver;
import tic_tac_toe.GameInterface;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeGUI implements ActionListener, GameObserver
{
   TicTacToeButtons buttons;
   JFrame mainFrame;
   JPanel mainPanel;
   JLabel instructions;
   GameInterface game;
   ControllerInterface controller;
   public TicTacToeGUI(ControllerInterface controller, GameInterface game)
   {
      this.game = game;
      this.controller = controller;

      // register this object as the observer of the game
      this.game.register(this); 

      // set up the user interface
      this.buttons = new TicTacToeButtons(game.getBoard(), this);
      this.mainFrame = new JFrame("Tic Tac Toe");
      this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      this.mainPanel = new JPanel();

      // set the background color of the panel that contains everything
      this.mainPanel.setBackground(new Color(227, 206, 245));
      // align the components of the main panel vertically
      this.mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
      // add some padding to the edges of the main panel
      this.mainPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

      this.instructions = new JLabel("Your piece is O");
      this.instructions.setAlignmentX(Component.CENTER_ALIGNMENT);
      this.mainPanel.add(instructions);

      this.buttons.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
      // make the buttons panel "see-through"
      this.buttons.setOpaque(false);
      this.mainPanel.add(buttons);

      this.mainFrame.add(mainPanel);

      this.mainFrame.addWindowListener(new WindowAdapter(){
         public void windowClosing(WindowEvent e){
            controller.userQuit();
         }
      });

      this.mainFrame.pack();
      this.mainFrame.setVisible(true);
   }

   // action listener implementation
   @Override
   public void actionPerformed(ActionEvent event)
   {
      TicTacToeButton button = (TicTacToeButton)event.getSource();
      this.controller.userSelected(button.getRow(), button.getCol());
   }


   // observer implementation
   @Override
   public void update()
   {
      this.buttons.showBoard();
      
      if (this.game.isGameOver())
      {
         this.buttons.disableAll();
         this.instructions.setText("Game Over");
      }
   }
}
