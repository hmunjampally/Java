package tic_tac_toe.controller;

import tic_tac_toe.GameInterface;
import tic_tac_toe.ControllerInterface;

import tic_tac_toe.model.GuiPlayer;
import tic_tac_toe.view.TicTacToeGUI;

public class GameController implements ControllerInterface
{
   GameInterface model;
   GuiPlayer human;
   TicTacToeGUI view;

   public GameController(GameInterface model, GuiPlayer human)
   {
      this.model = model;
      this.human = human;
      this.view = new TicTacToeGUI(this, model);
      this.model.nextMove();
   }

   public void userSelected(int row, int col)
   {
      human.setNextMove(row,col);
      model.nextMove();
   }
}
