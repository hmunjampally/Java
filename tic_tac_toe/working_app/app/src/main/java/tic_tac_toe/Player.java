package tic_tac_toe;

public abstract class Player
{
   protected TicTacToePiece myPiece;
   public Player(TicTacToePiece piece)
   {
      this.myPiece = piece;
   }

   public TicTacToePiece getPiece(){return this.myPiece;}

   public abstract boolean makeNextMove(TicTacToeBoard board);
}
