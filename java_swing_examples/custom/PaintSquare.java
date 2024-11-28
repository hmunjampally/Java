import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;

public class PaintSquare
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Square");
      // operation to do when the window is closed
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // create a panel that will hold our squares
      JPanel mainPanel = new JPanel();

      // create a square with default color
      ColoredSquare blueSquare = new ColoredSquare(200);
      // add blue square to the main panel
      mainPanel.add(blueSquare);

      // create a red square
      ColoredSquare redSquare = new ColoredSquare(200);
      redSquare.setColor(Color.RED);
      // add red square to the main panel
      mainPanel.add(redSquare);

      // create a green square
      ColoredSquare greenSquare = new ColoredSquare(200);
      greenSquare.setColor(Color.GREEN);
      // add green square to the main panel
      mainPanel.add(greenSquare);

      // add the main panel to the top-level container
      frame.add(mainPanel);

      // packs the components within the window based on their preferred size
      frame.pack();
      // make top-level container visible
      frame.setVisible(true);
   }
}
