package tic_tac_toe;

import tic_tac_toe.model.*;
import tic_tac_toe.controller.GameController;

public class App
{
   public static void main(String []args)
   {
      Player autoPlayer = new AutoPlayer(TicTacToePiece.X);
      GuiPlayer guiPlayer = new GuiPlayer(TicTacToePiece.O);
      Player []players = {guiPlayer, autoPlayer};

      TicTacToe ticTacToe = new TicTacToe(players);
      GameController controller = new GameController(ticTacToe, guiPlayer);
   }
}
