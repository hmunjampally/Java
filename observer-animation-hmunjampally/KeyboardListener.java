import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class KeyboardListener implements KeyListener
{
   protected Ball ball;
   protected BallDrawing drawing;
   protected LocationTracker locationTracker;

   public KeyboardListener(Ball ball, BallDrawing drawing, LocationTracker location)
   {
      this.ball = ball;
      this.drawing = drawing;
      this.locationTracker = location;
   }
   @Override
   public void keyPressed(KeyEvent e)
   {
      // when right, left, up, down keys are pressed
      // the position of the ball gets updated
      // however, we are also calling on the ball drawing
      // and the display showing the position of the board
      // to update.
      // TODO: remove the calls to drawing.move() and
      // locationTracker.showLocation() and turn
      // LocationTracker and BallDrawing into observers
      // of the ball, such that when the ball coordinates
      // get updated, all observers are notified.
      if (e.getKeyCode() == KeyEvent.VK_RIGHT)
      {
         ball.move(5,0);
         ball.notifyObservers();
      }
      else if (e.getKeyCode() == KeyEvent.VK_LEFT)
      {
         ball.move(-5,0);
         ball.notifyObservers();
      }
      else if (e.getKeyCode() == KeyEvent.VK_UP)
      {
         ball.move(0,-5);
         ball.notifyObservers();
      }
      else if (e.getKeyCode() == KeyEvent.VK_DOWN)
      {
         ball.move(0,5);
         ball.notifyObservers();
      }

   }

   @Override
   public void keyReleased(KeyEvent e)
   {
      // we don't care about this
   }

   @Override
   public void keyTyped(KeyEvent e)
   {
      // we don't care about this
   }
}


