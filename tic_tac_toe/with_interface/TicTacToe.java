public class TicTacToe
{
   public static void main(String []args)
   {
      TicTacToeBoard board = new TicTacToeBoard();
      TicTacToeTerminal terminal = new TicTacToeTerminal(board);

      TicTacToePiece []playerTicTacToePieces = {TicTacToePiece.X,TicTacToePiece.O};

      TicTacToePiece winner = null;
      
      Player autoPlayer = new AutoPlayer(TicTacToePiece.X);
      Player humanPlayer = new HumanPlayer(TicTacToePiece.O);

      Player []players = {autoPlayer, humanPlayer};
      int nextPlayer = 0;

      while(!board.isFull())
      {
         players[nextPlayer].makeNextMove(board);
         terminal.showBoard();

         winner = board.getWinner();   
         if (board.isFull() || winner != null)
         {
            break;
         }
         System.out.println("Next Player");
         nextPlayer = (nextPlayer + 1) % 2;
      }

      if (winner != null)
      {
         System.out.println("Winner is " + winner);
      }
   }
}
