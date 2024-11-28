import java.util.Scanner;

public class TicTacToeTerminal
{
   private TicTacToeBoard board;
   private Scanner scanner;

   public TicTacToeTerminal(TicTacToeBoard board)
   {
      this.board = board;
      this.scanner = new Scanner(System.in);
   }

   public void showBoard()
   {
      int boardSize = board.getSize();
      for (int i = 0; i < boardSize; i++)
      {
         String line = "";
         for (int j = 0; j < boardSize; j++)
         {
            TicTacToePiece piece = board.getTicTacToePiece(i,j);
            if (piece == null)
            {
               line+="-";
            }
            else
            {
               line+=piece;
            }
         }
         System.out.println(line);
      }
   }
 
}
