package DiceRoll;

// import javax.swing.JFrame;
// import javax.swing.SwingUtilities;

import DiceRoll.controller.Controller;
import DiceRoll.model.Dice;
import DiceRoll.view.*;

public class App {
    public static void main(String[] args)
    {
        Dice model = new Dice(null);
        DiceRollGUI view = new DiceRollGUI(model);
        Controller controller = new Controller(model, view);

        // JFrame frame = new JFrame("Dice Roll Game");
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.add(view);
        // frame.pack();
        // frame.setVisible(true);

        controller.start();
    }
}
// package DiceRoll;

// import DiceRoll.view.DiceRollGUI;

// public class App{
// public static void main(String[] args) {
//     DiceRollGUI temp = new DiceRollGUI();
        
// }
// }