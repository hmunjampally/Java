import javax.swing.*;
public class MovingBallGUI
{
   JFrame mainFrame;
   JPanel mainPanel;
   BallDrawing drawing;
   LocationTracker locationTracker;
   Ball ball;

   public MovingBallGUI()
   {
      mainFrame = new JFrame();
      mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      mainPanel = new JPanel();
      mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));   
   
      // the ball model
      ball = new Ball(175,350);

      // the drawing of the ball
      drawing = new BallDrawing(400, ball);

      // the display showing the location of the ball
      locationTracker = new LocationTracker(ball);

      mainPanel.add(locationTracker);
      mainPanel.add(drawing);

      KeyboardListener listener = new KeyboardListener(ball, drawing, locationTracker);
      mainFrame.addKeyListener(listener);

      mainFrame.add(mainPanel);
      mainFrame.pack();
      mainFrame.setVisible(true);
   }


   public static void main(String []args)
   {
      MovingBallGUI movingBall = new MovingBallGUI();
   }
}
