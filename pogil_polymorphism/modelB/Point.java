import java.lang.Math;

public class Point
{
   protected double xValue;
   protected double yValue;
   
   public Point(double x, double y)
   {
      this.xValue = x;
      this.yValue = y;
   }

   public double getX()
   {
      return xValue;
   }

   public double getY()
   {
      return yValue;
   }

   public double getDistanceFromZero()
   {
      return Math.sqrt(this.xValue * this.xValue + this.yValue * this.yValue);
   }
}
