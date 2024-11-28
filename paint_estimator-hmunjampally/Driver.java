import java.io.*;

public class Driver
{
   public static void main(String []args)
   {
      PaintEstimator estimator = new PaintEstimator(0.35);
      Circle circleTable = new Circle(5);
      Rectangle rectangleTable = new Rectangle(6,8);
      Cylinder cylinderTable = new Cylinder(circleTable, 10);

      System.out.println("");

      double circleTablePaint = estimator.getPaintEstimate(circleTable);
      System.out.println("Need " + circleTablePaint + " ounces of paint for a circular table with radius " + 
         circleTable.getRadius());

      

      double rectangleTablePaint = estimator.getPaintEstimate(rectangleTable);
      System.out.println("Need " + rectangleTablePaint + " ounces of paint for a " + rectangleTable.getWidth() + " by " + 
         rectangleTable.getLength() + " table ");

      

      double cylinderTablePaint = estimator.getPaintEstimate(cylinderTable);
      System.out.println("Need " + cylinderTablePaint + " ounces of paint for a " + cylinderTable.getArea() + " by " + 
         cylinderTable.getVolume() + " table ");

      System.out.println("");
   }
}
