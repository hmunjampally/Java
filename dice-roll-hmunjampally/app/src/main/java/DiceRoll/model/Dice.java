package DiceRoll.model;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Dice extends JPanel
{
    
    public JButton []buttons;
    String []diceFace = {"\u2680", "\u2681", "\u2682", "\u2683", "\u2684", "\u2685"};

    public Dice(ActionListener listener)
    {
        
        this.buttons = new JButton[3];
        int nextButton = 0;
        for (int i=1; i<=3; i++)
        {
            this.buttons[nextButton] = new JButton("\u2680");
            this.buttons[nextButton].addActionListener(listener);
            this.buttons[nextButton].setFocusable(false);
            this.buttons[nextButton].setFont(new Font(null,Font.BOLD,80));
            this.buttons[nextButton].setBorder(null);
            this.buttons[nextButton].setBackground(Color.cyan);
            
            this.buttons[nextButton].setAlignmentX(Component.CENTER_ALIGNMENT);
            this.add(this.buttons[nextButton]);
            
            nextButton++;
        }
        
    }

    public String DiceFaceValue(int val)
    {   
    
        return this.diceFace[val-1].toString();
    }
}