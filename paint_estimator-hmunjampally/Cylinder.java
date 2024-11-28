public class Cylinder implements PaintingAreas
{
   private Circle base;
   private double height;

   public Cylinder(Circle base, double height)
   {
      this.base = base;
      this.height = height;
   }

   @Override
   public double getArea()
   {
      return 2 * this.base.getArea() + this.base.getCircumference() * this.height;
   }

   public double getVolume()
   {
      return this.base.getArea() * this.height;
   }
}
