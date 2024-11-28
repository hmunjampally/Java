package tic_tac_toe;

public class TicTacToe
{
   protected TicTacToeBoard board;
   protected Player []players;
   protected int nextPlayer = 0;

   public TicTacToe(TicTacToeBoard board, Player []players)
   {
      this.board = board;
      this.players = players;
   }

   public boolean nextMove()
   {
      boolean success = players[nextPlayer].makeNextMove(board);
      if (success)
      {
         nextPlayer = (nextPlayer + 1) % players.length;
      }
      return success;
   }

   public boolean isGameOver()
   {
      return board.isFull() || board.getWinner() != null;
   }

   public Player getFirstPlayer()
   {
      return this.players[0];
   }

   public static void main(String []args)
   {
      TicTacToeBoard board = new TicTacToeBoard();
      TicTacToePiece []playerTicTacToePieces = {TicTacToePiece.X,TicTacToePiece.O};

      TicTacToePiece winner = null;
      
      Player autoPlayer = new AutoPlayer(TicTacToePiece.X);
      Player humanPlayer = new HumanPlayer(TicTacToePiece.O);

      Player []players = {autoPlayer, humanPlayer};

      TicTacToe ticTacToe = new TicTacToe(board, players);
      TicTacToeTerminal display = new TicTacToeTerminal(board);

      while(!ticTacToe.isGameOver())
      {
         ticTacToe.nextMove();
         display.showBoard();
      }

      winner = board.getWinner();   
      if (winner != null)
      {
         System.out.println("Winner is " + winner);
      }
   }
}
