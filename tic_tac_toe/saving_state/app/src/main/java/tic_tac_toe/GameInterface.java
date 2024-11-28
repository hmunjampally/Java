package tic_tac_toe;
import java.io.Serializable;

public interface GameInterface extends Serializable
{
   public boolean nextMove();
   public boolean isGameOver();
   public BoardInterface getBoard();

   // observer design pattern
   public void register(GameObserver observer);
   public void unregister(GameObserver observer);
   public void notifyObservers();
}
