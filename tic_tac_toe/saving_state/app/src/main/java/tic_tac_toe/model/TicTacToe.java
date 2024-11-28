package tic_tac_toe.model;

import tic_tac_toe.GameObserver;
import tic_tac_toe.GameInterface;
import tic_tac_toe.BoardInterface;

import java.util.ArrayList;

public class TicTacToe implements GameInterface
{
   protected TicTacToeBoard board;
   protected Player []players;
   protected int nextPlayer = 0;
   protected transient ArrayList<GameObserver> observers;

   public TicTacToe(Player []players)
   {
      this.board = new TicTacToeBoard();
      this.players = players;
   }

   public boolean nextMove()
   {
      boolean success = true;
      while (success)
      {
         success = players[nextPlayer].makeNextMove(board);
         if (success)
         {
            nextPlayer = (nextPlayer + 1) % players.length;
         }
      }
      notifyObservers();
      return success;
   }

   @Override
   public boolean isGameOver()
   {
      return board.isFull() || board.getWinner() != null;
   }

   @Override
   public BoardInterface getBoard()
   {
      return this.board;
   }

   public Player getFirstPlayer()
   {
      return this.players[0];
   }

   @Override
   public void register(GameObserver observer)
   {
      if (this.observers == null)
      {
         this.observers = new ArrayList<GameObserver>();
      }
      observers.add(observer);
   }

   @Override 
   public void unregister(GameObserver observer)
   {
      if (observers != null)
      {
         observers.add(observer);
      }
   }

   @Override 
   public void notifyObservers()
   {
      if (observers != null)
      {
         for (GameObserver o: observers)
         {
            o.update();
         }
      }
   }

}
