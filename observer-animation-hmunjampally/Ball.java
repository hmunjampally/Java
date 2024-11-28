/*
 *  Class that defines a point in 2D
 **/

import java.util.ArrayList;
import java.util.List;

public class Ball implements Subject
{
   protected int x;
   protected int y;
   protected int diameter = 50;
   private List<Observer> observers = new ArrayList<>();

   public Ball()
   {
      this.x = 0;
      this.y = 0;
      this.diameter = 10;
   }

   public Ball(int x, int y)
   {
      this.x = x;
      this.y = y;
   }

   public int getX()
   {
      return x;
   }

   public int getY()
   {
      return y;
   }

   public int getDiameter()
   {
      return diameter;
   }

   public void move(int xDistance, int yDistance)
   {
      this.x+=xDistance;
      this.y+=yDistance;
   }

   public void adjustSize(int amount)
   {
      this.diameter+=amount;
   }

   @Override
   public void register(Observer observer) {
      observers.add(observer);
  }

  @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }


}
