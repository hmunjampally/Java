package triangle.view;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.event.*;
import java.text.*;

public class UserInterface
{
   public UserInterface()
   {
       JFrame mainFrame = new JFrame("Triangle classifier");
       mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       JPanel mainPanel = new JPanel();
       mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
       ResultLabel results = new ResultLabel();
       JLabel instructions = new JLabel("Enter three sides of a triangle");

       // section of the UI that allows the user to enter the 
       // three sides of a triangle
       NumberFormat format = NumberFormat.getIntegerInstance();
       NumberFormatter numberFormatter = new NumberFormatter(format){
          @Override
          public Object stringToValue(String text) throws ParseException {
              if (text.length() == 0)
                  return null;
              return super.stringToValue(text);
          }
       };
       numberFormatter.setValueClass(Integer.class);
       numberFormatter.setAllowsInvalid(false);
       numberFormatter.setMinimum(0);

       JFormattedTextField side1 = new JFormattedTextField(numberFormatter);
       JFormattedTextField side2 = new JFormattedTextField(numberFormatter);
       JFormattedTextField side3 = new JFormattedTextField(numberFormatter);
       side1.setColumns(5);
       side2.setColumns(5);
       side3.setColumns(5);

       JPanel inputPanel = new JPanel();
       inputPanel.add(side1);
       inputPanel.add(side2);
       inputPanel.add(side3);

       JButton submitButton = new JButton("Submit");
       submitButton.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e)
          {
             results.classify(side1.getText(), side2.getText(), side3.getText());
          }
       });
       inputPanel.add(submitButton);

       JPanel padding = new JPanel();
       // assemble all the elements
       mainPanel.add(instructions);
       mainPanel.add(inputPanel);
       mainPanel.add(results);
       mainPanel.add(padding);

       mainFrame.add(mainPanel);
       mainFrame.pack();
       mainFrame.setVisible(true);

   }
}
