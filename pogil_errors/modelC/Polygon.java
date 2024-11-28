import java.util.ArrayList;

public class Polygon
{
   private ArrayList<Point2D> points;

   public void addPoint(Point2D nextPoint)
   {
      points.add(nextPoint);
   }

   public String toString()
   {
      String output = new String();
      for (int i = 0; i < points.size(); i++)
      {
         output+= points.get(i);
      }
      return output;
   }
}
