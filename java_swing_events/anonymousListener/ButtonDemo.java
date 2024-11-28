import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;

public class ButtonDemo
{

    public static void main(String []args)
    {
        // create a top-level container
        JFrame mainFrame = new JFrame("Button Demo");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create a button
        JButton submitButton = new JButton("submit");
        // make the button large
        submitButton.setPreferredSize(new Dimension(200,100));

        // define, instantiate, and attach the anonymous listener
        // to the button
        submitButton.addActionListener(
          new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("button clicked");
            }
        });

        // add the button to the top-level container
        mainFrame.add(submitButton);
        // auto-size everything
        mainFrame.pack();
        // make the top-level container visible
        mainFrame.setVisible(true);
    }
}
