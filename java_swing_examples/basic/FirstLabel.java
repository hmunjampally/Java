import javax.swing.*;
import java.awt.Dimension;

public class FirstLabel
{
   public static void main(String[] args)
   {
      // JFrame is a top-level container, which can be visible on screen
      JFrame frame = new JFrame("My First Label");
      // operation to do when the window is closed
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // It is convenient to put multiple GUI elements into a JPanel
      // and then add that panel to the top level container
      JPanel mainPanel = new JPanel();
      // set the size of the panel (in pixels)
      mainPanel.setPreferredSize(new Dimension(300,300));

      // A text labelclear
      
      JLabel label = new JLabel("I Love SWING");

      // add the text label to the mainPanel
      mainPanel.add(label);

      // add the mainPanel to the top level container
      // all GUI elements of the mainPanel will be visible
      // within the top-level container
      frame.add(mainPanel);

      // packs the components within the window based on their preferred size
      frame.pack();
      // make top-level container visible
      frame.setVisible(true);
   }
}
