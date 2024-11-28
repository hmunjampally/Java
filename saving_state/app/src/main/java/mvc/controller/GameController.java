package mvc.controller;

import java.io.*;

import mvc.ControllerInterface;

import mvc.view.TicTacToeGUI;
import mvc.view.ConfirmationDialog;
import mvc.view.FileSelector;

import mvc.model.TicTacToeBoard;
import mvc.model.TicTacToePiece;
import mvc.model.AutoPlayer;

public class GameController implements ControllerInterface
{
   TicTacToeBoard board;
   AutoPlayer autoPlayer;
   TicTacToeGUI view;
   TicTacToePiece userPiece;

   public GameController()
   {
      try
      {
         loadFromFile();
         start();
      }
      catch (Exception error)
      {
         System.out.println(error.getMessage());
      }
   }

   public GameController(TicTacToeBoard board, AutoPlayer autoPlayer)
   {
      this.board = board;
      this.autoPlayer = autoPlayer;
      start();
   }

   private void start()
   {
      switch (autoPlayer.getPiece())
      {
         case X:
            this.userPiece = TicTacToePiece.O;
            break;
         default:
            this.userPiece = TicTacToePiece.X;
      }
      this.view = new TicTacToeGUI(this, this.board);
   }

   public void userPressed(int row, int col)
   {
      board.placeTicTacToePiece(row, col, userPiece);
      if (!board.isGameOver())
      {
          autoPlayer.makeNextMove(this.board);
      }
   }

   public void userQuit()
   {
      if (!ConfirmationDialog.confirmSaveGame())
      {
         return;
      }
      try
      {
         String filePath = FileSelector.selectFileToSave();
         FileOutputStream fileOutputStream = new FileOutputStream(filePath);
         ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
         objectOutputStream.writeObject(this.board);
         objectOutputStream.writeObject(this.autoPlayer);
         objectOutputStream.close();
         fileOutputStream.close();
      }
      catch (IOException exception)
      {
         System.out.println(exception.getMessage());
      }
   }

   public void loadFromFile() throws IOException, ClassNotFoundException
   {
      String filePath = FileSelector.selectFileToLoad();
      FileInputStream fileInputStream = new FileInputStream(filePath);
      ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
      this.board = (TicTacToeBoard)objectInputStream.readObject();
      this.autoPlayer = (AutoPlayer)objectInputStream.readObject();
      objectInputStream.close();
      fileInputStream.close();
      System.out.println("Loaded from file");
   }

}
