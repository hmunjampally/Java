import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class WordgamePrototype// implements ActionListener
{
    JFrame mainFrame;
    JPanel mainPanel;
    JLabel wordlabel;
    JPanel main;
    JButton lettersButton;

    public WordgamePrototype()
    {

        //MAIN FRAME
        this.mainFrame = new JFrame("Word game");
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainFrame.setPreferredSize(new Dimension(800,500));
        this.mainFrame.setResizable(false);
        

        //MAIN PANEL FOR BUTTONS
        this.mainPanel = new JPanel();
        this.mainPanel.setPreferredSize(new Dimension(800, 400));
        this.mainPanel.setBackground(new Color(250, 210,230));
       

        
        //PANEL FOR WORD
        this.main = new JPanel();
        this.main.setPreferredSize(new Dimension(800, 100));
        this.main.setBackground(new Color(250, 210,230));

        //testfield
        this.wordlabel = new JLabel("_ _ _ _ h _ _ t _");
        this.wordlabel.setOpaque(false);
        this.wordlabel.setFont(new Font("Times New Roman", 0, 30));
        this.wordlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.main.add(this.wordlabel);


        //BUTTONS FOR ALPHABETS
        for (char letter = 'a'; letter <= 'z'; letter++)
        {
            this.lettersButton = new JButton(""+letter);
            this.lettersButton.setFocusable(false);
            this.lettersButton.setFont(new Font("Times New Roman", 0, 20));
            this.lettersButton.setBackground(Color.WHITE);
            this.lettersButton.setForeground(Color.BLUE);
            this.mainPanel.add(this.lettersButton);
            if (letter == 'h' || letter == 't') {
                lettersButton.setEnabled(false);
            }
            
        }

       // this.lettersButton.addActionListener(this);

        //ADDING EVERYTHIG TO PANEL THEN TO FRAME
        this.mainFrame.add(this.mainPanel);
        this.mainFrame.add(this.main,BorderLayout.NORTH);
        this.mainFrame.pack();
        this.mainFrame.setVisible(true);

    }


    // public void actionPerformed(ActionEvent event)
    // {
    //     this.lettersButton.setEnabled(false);
    //     this.mainPanel.repaint();
    // }
    

    public static void main(String []args)
   {
      WordgamePrototype demo = new WordgamePrototype();
   }

}

