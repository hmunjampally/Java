package tic_tac_toe.model;

import tic_tac_toe.TicTacToePiece;

public class AutoPlayer extends Player
{
   public AutoPlayer(TicTacToePiece piece)
   {
      super(piece);
   }

   public boolean makeNextMove(TicTacToeBoard board)
   {
      System.out.println("Computer moved");
      int boardSize = board.getSize();
      for (int i = 0; i < boardSize; i++)
      {
         for (int j = 0; j < boardSize; j++)
         {
            if(board.placeTicTacToePiece(i,j,this.myPiece))
            {
               return true;
            }
         }
      }
      return false;
   }

}
