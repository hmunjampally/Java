package triangle.view;

import javax.swing.*;

import triangle.Triangle;

public class ResultLabel extends JLabel
{
   protected String label = "Your Triangle is ";
   public ResultLabel()
   {
      super();
      setText(label);
   }

   public void classify(String side1, String side2, String side3)
   {
      int side1Int = Integer.parseInt(side1);
      int side2Int = Integer.parseInt(side2);
      int side3Int = Integer.parseInt(side3);

      Triangle triangle = new Triangle(side1Int, side2Int, side3Int);
      label = "";
      if (triangle.isIsosceles())
      {
         label+="ISOCELES\n";
      }
      if (triangle.isScalene())
      {
         label+="SCALENE\n";
      }
      if (triangle.isEquilateral())
      {
         label+="EQUILATERAL\n";
      }

      setText(label);
   }
}
