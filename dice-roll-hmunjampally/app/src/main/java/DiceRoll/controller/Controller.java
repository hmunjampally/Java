package DiceRoll.controller;

import DiceRoll.ControllerInterface;
import DiceRoll.model.Dice;
import DiceRoll.view.DiceRollGUI;

public class Controller implements ControllerInterface{

    private Dice model;
    private DiceRollGUI view;
    public Controller(Dice model2, DiceRollGUI view2) {
    }

    @Override
    public void Controller(Dice model, DiceRollGUI view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        // No specific initialization needed for this simple example
    }
}
