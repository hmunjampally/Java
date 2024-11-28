package tic_tac_toe;

import tic_tac_toe.model.*;
import tic_tac_toe.controller.GameController;
import tic_tac_toe.view.ConfirmationDialog;

public class App
{
   public static void main(String []args)
   {
      GameController controller;
      if (ConfirmationDialog.confirmLoadGame())
      {
         controller = new GameController();
      }
      else
      {
         Player autoPlayer = new AutoPlayer(TicTacToePiece.X);
         GuiPlayer guiPlayer = new GuiPlayer(TicTacToePiece.O);
         Player []players = {guiPlayer, autoPlayer};

         TicTacToe ticTacToe = new TicTacToe(players);
         controller = new GameController(ticTacToe, guiPlayer);
      }
   }
}
