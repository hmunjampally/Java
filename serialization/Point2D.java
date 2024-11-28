import java.io.Serializable;

public class Point2D implements Serializable
{
   protected int x;
   protected int y;

   public Point2D(int x, int y)
   {
      this.x = x;
      this.y = y;
   }

   public int getX(){return this.x;}
   public int getY(){return this.y;}

   public String toString()
   {
      return "("+this.x+", "+this.y+")";
   }
}
