import java.awt.*;
import javax.swing.*;

public class FirstButton
{
   public static void main(String[] args)
   {
      // JFrame is a top-level container, which can be visible on screen
      JFrame frame = new JFrame("Look at this button");
      // operation to do when the window is closed
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // It is convenient to put multiple GUI elements into a JPanel
      // and then add that panel to the top level container
      JPanel mainPanel = new JPanel();
      mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

      // A Button with some text
      JButton button = new JButton("Press me!");

      // A Button without text
      JButton noTextButton = new JButton();

      // add the text label to the mainPanel
      mainPanel.add(button);
      mainPanel.add(noTextButton);

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
