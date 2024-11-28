public class Circle implements PaintingAreas
{
   private double radius;

   public Circle()
   {
      this.radius = 1;
   }

   public Circle(double radius)
   {
      this.radius = radius;
   }
   
   public double getRadius(){return this.radius;}

   @Override
   public double getArea()
   {
      return Math.PI * this.radius * this.radius;
   }

   public double getCircumference()
   {
      return 2 * Math.PI * this.radius;
   }

}
