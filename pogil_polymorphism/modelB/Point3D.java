import java.lang.Math;

public class Point3D extends Point
{
   protected double zValue;

   public Point3D(double x, double y, double z)
   {
      super(x,y);
      this.zValue = z;
   }

   public double getZ()
   {
      return this.zValue;
   }

   public double getDistanceFromZero()
   {
      return Math.sqrt(this.xValue * this.xValue + this.yValue * this.yValue + this.zValue * this.zValue);
   }
}
