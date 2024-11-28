public class Cylinder
{
   private Circle base;
   private double height;

   public Cylinder(Circle base, double height)
   {
      this.base = base;
      this.height = height;
   }

   public double getArea()
   {
      return 2 * this.base.getArea() + this.base.getCircumference() * this.height;
   }

   public double getVolume()
   {
      return this.base.getArea() * this.height;
   }
}
