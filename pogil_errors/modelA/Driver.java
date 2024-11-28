public class Driver
{
   public static void main(String []args)
   {
      Point2D p1 = new Point2D(10,10);
      Point2D p2 = new Point2D(10,15);
      Point2D p3 = new Point2D(20,20);

      Polygon triangle = new addPoint(p1);
      //triangle.addPoint(p1);
      triangle.addPoint(p2);
      triangle.addPoint(p3);

      System.out.println(triangle);
   }
}
