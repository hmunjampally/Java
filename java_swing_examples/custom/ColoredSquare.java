import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class ColoredSquare extends JPanel
{
   private int length;
   private Color color;
   public ColoredSquare(int length)
   {
      this.length = length;
      setPreferredSize(new Dimension(this.length, this.length));
      color = Color.BLUE;
   }

   public void setColor(Color c)
   {
      this.color = c;
   }

   @Override
   public void paint(Graphics g)
   {
      super.paint(g);
      g.setColor(this.color);
      g.fillRect(0, 0, this.length, this.length);
   }

}

