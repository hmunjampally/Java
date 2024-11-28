import javax.swing.*;
import java.awt.*;

public class BallDrawing extends JPanel implements Icon, Observer
{
   int height;
   int width;
   Ball ball;

   public BallDrawing(int panelWidth, Ball ball)
   {
      this.width = panelWidth;
      this.height = panelWidth;
      JLabel imageLabel = new JLabel(this);
      this.add(imageLabel);
      this.ball = ball;
      ball.register(this);
   }

   public void move()
   {
      this.repaint();
   }

   @Override
   public int getIconHeight()
   {
      return this.height;
   }

   @Override
   public int getIconWidth()
   {
      return this.width;
   }

   @Override
   public void paintIcon(Component component, Graphics graphics, int x, int y)
   {
      graphics.setColor(Color.RED);
      graphics.fillOval(
         x+this.ball.getX(), 
         y+this.ball.getY(), 
         ball.getDiameter(), ball.getDiameter());
   }


   @Override
    public void update() {
        this.repaint();
    }


}
