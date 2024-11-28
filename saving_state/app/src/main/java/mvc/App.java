/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package mvc;
import mvc.model.*;
import mvc.controller.*;
import mvc.view.ConfirmationDialog;

public class App {
    public static void main(String[] args) {

        if (ConfirmationDialog.confirmLoadGame())
        {
           GameController controller = new GameController();
        }
        else
        {
           TicTacToeBoard board = new TicTacToeBoard();
           if (args.length > 0)
           {
              GameControllerTwoPlayer controller = new GameControllerTwoPlayer(board); 
           }
           else
           {
              AutoPlayer autoPlayer = new AutoPlayer(TicTacToePiece.X);
              GameController controller = new GameController(board, autoPlayer);
           }
        }
    }
}