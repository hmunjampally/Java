import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;

public class ButtonDemo implements ActionListener
{

    public ButtonDemo()
    {
        // create a top-level container
        JFrame mainFrame = new JFrame("Button Demo");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create a button
        JButton submitButton = new JButton("submit");
        // make the button big
        submitButton.setPreferredSize(new Dimension(200,100));

        // add the listener for button clicks
        // since ButtonDemo class implements ActionListener
        // 'this' object is-an ActionListener
        submitButton.addActionListener(this);

        // add the button to the top-level container
        mainFrame.add(submitButton);

        // auto size everything
        mainFrame.pack();

        // make the top-level container visible
        mainFrame.setVisible(true);
    }

    // our implementation of the ActionListener interface
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("button clicked");
    }

    // program execution starts here
    public static void main(String []args)
    {
        // create an instance of ButtonDemo
        ButtonDemo demo = new ButtonDemo();
    }


}
