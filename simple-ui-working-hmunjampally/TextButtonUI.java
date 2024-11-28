import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;

public class TextButtonUI implements ActionListener
{
    JFrame mainFrame;
    JPanel mainPanel;
    JLabel userText;
    JTextField userInputField;
    JButton submitButton;

    public TextButtonUI()
    {
       // create a top-level container
       this.mainFrame = new JFrame("Button Demo");
       this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // create a special container for storing all the piecies
       this.mainPanel = new JPanel();
       this.mainPanel.setLayout(new BoxLayout(this.mainPanel,BoxLayout.Y_AXIS));
       // create text containing a question
       this.userText = new JLabel("");
       this.userText.setPreferredSize(new Dimension(400,30));
       // align the text in the center
       this.userText.setAlignmentX(JPanel.CENTER_ALIGNMENT);
       this.mainPanel.add(this.userText);

       // create a text field (area for the user to input text)
       this.userInputField = new JTextField();
       this.userInputField.setPreferredSize(new Dimension(400, 30));
       this.mainPanel.add(this.userInputField);

       // create a button for submitting the user's answer
       this.submitButton = new JButton("Submit");
       // align the button in the center
       this.submitButton.setAlignmentX(JPanel.CENTER_ALIGNMENT);

       this.submitButton.addActionListener(this);

       // add the button to our special container
       this.mainPanel.add(this.submitButton);

       // add the special container to the top-level container
       this.mainFrame.add(this.mainPanel);
       // auto-size everything
       this.mainFrame.pack();
       // make top-level container visible
       this.mainFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event)
    {
       // retrieve the user's answer, parse it as an integer
       // compare to the correct answer.
       // if the user is incorrect, change the text 
       // (which contained the question) to WRONG,
       // otherwise change the text to CORRECT
      String message = this.userInputField.getText();
          
      this.userText.setText("You entered: "+message);
          // remove the submit button from our special container
          // (we don't need it anymore)
      this.submitButton.setEnabled(false);
      this.userInputField.setEnabled(false);
          // re-draw our special container
      this.mainPanel.repaint();
          
       
      }
     
   }

   



