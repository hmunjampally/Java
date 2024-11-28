public class PaintEstimator
{
   private double ouncesPerSquareFoot;

   public PaintEstimator(double ozPerSquareFoot)
   {
      this.ouncesPerSquareFoot = ozPerSquareFoot;
   }

   public double getPaintEstimate(PaintingAreas areas)
   {
      double paintarea = areas.getArea();
      return this.ouncesPerSquareFoot*paintarea;
   }

}
   /**
    * Gets an estimate (in ounces) of paint needed to cover a given
    * circular area
    
   public double getPaintEstimate(Circle circle)
   {
      double areaToPaint = circle.getArea();
      return this.ouncesPerSquareFoot * areaToPaint;
   }

   /** 
    * Gets an estimate (in ounces) of paint needed to cover a given
    * rectangular area
   
   public double getPaintEstimate(Rectangle rectangle)
   {
      double areaToPaint = rectangle.getArea();
      return this.ouncesPerSquareFoot * areaToPaint;
   }
}
*/