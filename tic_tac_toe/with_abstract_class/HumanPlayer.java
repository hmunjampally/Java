import java.util.Scanner;

public class HumanPlayer extends Player
{
   private Scanner scanner;

   public HumanPlayer(TicTacToePiece piece)
   {
      super(piece);
      this.scanner = new Scanner(System.in);
   }
 
   public boolean makeNextMove(TicTacToeBoard board)
   {
      if (board.isFull())
      {
         return false;
      }

      int row = 0;
      int col = 0;
      do
      {
         System.out.println("Enter row: ");
         row = this.scanner.nextInt();
         System.out.println("Enter colunn: ");
         col = this.scanner.nextInt();
      }while (!board.placeTicTacToePiece(row, col, this.myPiece));
      return true;
   }

}
