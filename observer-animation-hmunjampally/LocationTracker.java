import javax.swing.*;

public class LocationTracker extends JPanel implements Observer
{
   private Ball ball;
   private JLabel locationLabel;
   public LocationTracker(Ball ball)
   {
      this.ball = ball;
      this.locationLabel = new JLabel();
      showLocation();
      this.add(locationLabel);
      ball.register(this);
   }

   public void showLocation()
   {
      this.locationLabel.setText("("+ball.getX()+", "+ball.getY()+")");

   }

   @Override
   public void update() {
       showLocation();
   }

}
