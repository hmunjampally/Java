/*
 *  Class that defines a point in 2D
 **/


public class MovingPoint2D extends Point2D
{
   
   public MovingPoint2D()
   {
      super();
   }

   public MovingPoint2D(int x, int y)
   {
      super(x,y);
   }

   public void moveVertically(int length)
   {
      y = this.getY() + length;
   }

   public void moveHorizontally(int length)
   {
      x = this.getX() + length;
   }
   public String toString()
   {
      String val = "(" + x + ", " + y + ")";
      return val; 
   }
}
