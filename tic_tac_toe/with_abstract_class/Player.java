public abstract class Player
{
   protected TicTacToePiece myPiece;
   public Player(TicTacToePiece piece)
   {
      this.myPiece = piece;
   }

   public abstract boolean makeNextMove(TicTacToeBoard board);
}
