package tic_tac_toe.model;
import tic_tac_toe.TicTacToePiece;

public class GuiPlayer extends Player
{
   protected int nextRow = 0;
   protected int nextCol = 0;
   protected boolean ready = false;

   public GuiPlayer(TicTacToePiece piece)
   {
      super(piece);
   }

   public boolean makeNextMove(TicTacToeBoard board)
   {
      if (ready)
      {
         System.out.println("Human moved");
         ready = false;
         return board.placeTicTacToePiece(this.nextRow, this.nextCol, this.myPiece);
      }
      return false;
   }

   public void setNextMove(int row, int col)
   {
      this.nextRow = row;
      this.nextCol = col;
      ready = true;
   }
}
