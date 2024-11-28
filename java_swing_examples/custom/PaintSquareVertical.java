import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;

public class PaintSquareVertical
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Square");
      // operation to do when the window is closed
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // create a panel that will hold our squares
      JPanel mainPanel = new JPanel();

      // set BorderLayout on mainPanel to control
      // where the squares are positioned
      mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

      // create a square with default color
      ColoredSquare blueSquare = new ColoredSquare(200);
      mainPanel.add(blueSquare);

      // create a red square
      ColoredSquare redSquare = new ColoredSquare(200);
      redSquare.setColor(Color.RED);
      // add red square to the main panel at the bottom (SOUTH)
      // You can also use BorderLayout.EAST and BorderLayout.WEST
      mainPanel.add(redSquare);

      // create a green square
      ColoredSquare greenSquare = new ColoredSquare(200);
      greenSquare.setColor(Color.GREEN);
      // add green square to the main panel in the middle (CENTER)
      mainPanel.add(greenSquare);

      // add the main panel to the top-level container
      frame.add(mainPanel);

      // packs the components within the window based on their preferred size
      frame.pack();
      // make top-level container visible
      frame.setVisible(true);
   }
}
