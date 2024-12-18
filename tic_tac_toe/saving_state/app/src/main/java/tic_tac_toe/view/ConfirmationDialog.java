package tic_tac_toe.view;

import javax.swing.JOptionPane;

public class ConfirmationDialog
{
   public static boolean confirmSaveGame()
   {
      int input = JOptionPane.showConfirmDialog(null, "Do you want to save the game?", "Select Yes or No", JOptionPane.YES_NO_OPTION);
      return interpretInput(input);
   }

   public static boolean confirmLoadGame()
   {
      int input = JOptionPane.showConfirmDialog(null, "Do you want to load the game from file?", "Select Yes or No", JOptionPane.YES_NO_OPTION);
      return interpretInput(input);
   }

   private static boolean interpretInput(int input)
   {
      if (input == 0)
      {
         return true;
      }
      return false;
   }
}
