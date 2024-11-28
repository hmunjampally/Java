package tic_tac_toe.controller;

import tic_tac_toe.GameInterface;
import tic_tac_toe.ControllerInterface;

import tic_tac_toe.model.GuiPlayer;
import tic_tac_toe.view.TicTacToeGUI;
import tic_tac_toe.view.ConfirmationDialog;
import tic_tac_toe.view.FileSelector;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class GameController implements ControllerInterface
{
   GameInterface model;
   GuiPlayer human;
   TicTacToeGUI view;

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

   public GameController(GameInterface model, GuiPlayer human)
   {
      this.model = model;
      this.human = human;
      start();
   }

   private void start()
   {
      this.view = new TicTacToeGUI(this, this.model);
      this.model.nextMove();
   }

   public void userSelected(int row, int col)
   {
      human.setNextMove(row,col);
      model.nextMove();
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
         objectOutputStream.writeObject(this.model);
         objectOutputStream.writeObject(this.human);
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
      this.model = (GameInterface)objectInputStream.readObject();
      this.human = (GuiPlayer)objectInputStream.readObject();
      objectInputStream.close();
      fileInputStream.close();
      System.out.println("Loaded from file");
   }
}
