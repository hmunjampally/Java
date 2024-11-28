package tic_tac_toe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeGUI implements ActionListener
{
   TicTacToeButtons buttons;
   JFrame mainFrame;
   JPanel mainPanel;
   JLabel instructions;
   GuiPlayer guiPlayer;
   TicTacToe gameRules;

   public TicTacToeGUI(TicTacToeBoard board, TicTacToe gameRules, GuiPlayer player)
   {
      this.buttons = new TicTacToeButtons(board, this);
      this.guiPlayer = player;
      this.gameRules = gameRules;
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

      this.mainFrame.pack();
      this.mainFrame.setVisible(true);
   }

   public void startGame()
   {
      if (this.guiPlayer != this.gameRules.getFirstPlayer())
      {
         this.update();
      }
   }

   @Override
   public void actionPerformed(ActionEvent event)
   {
      TicTacToeButton button = (TicTacToeButton)event.getSource();
      this.guiPlayer.setNextMove(button.getRow(), button.getCol());
      button.setEnabled(false);
      this.update();
   }

   private void update()
   {
      while (this.gameRules.nextMove())
      {
         this.buttons.showBoard();

         if (this.gameRules.isGameOver())
         {
            this.buttons.disableAll();
            this.instructions.setText("Game Over");
            break;
         }
      }
   }

   public static void main(String []args)
   {
      TicTacToeBoard board = new TicTacToeBoard();
      TicTacToePiece []playerTicTacToePieces = {TicTacToePiece.X,TicTacToePiece.O};

      Player autoPlayer = new AutoPlayer(TicTacToePiece.X);
      GuiPlayer guiPlayer = new GuiPlayer(TicTacToePiece.O);
      Player []players = {autoPlayer, guiPlayer};

      TicTacToe ticTacToe = new TicTacToe(board, players);
      TicTacToeGUI display = new TicTacToeGUI(board, ticTacToe, guiPlayer);
      display.startGame();
   }

}
