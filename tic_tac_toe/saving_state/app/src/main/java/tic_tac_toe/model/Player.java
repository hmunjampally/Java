package tic_tac_toe.model;

import tic_tac_toe.TicTacToePiece;
import java.io.Serializable;

public abstract class Player implements Serializable
{
   protected TicTacToePiece myPiece;
   public Player(TicTacToePiece piece)
   {
      this.myPiece = piece;
   }

   public TicTacToePiece getPiece(){return this.myPiece;}

   public abstract boolean makeNextMove(TicTacToeBoard board);
}
