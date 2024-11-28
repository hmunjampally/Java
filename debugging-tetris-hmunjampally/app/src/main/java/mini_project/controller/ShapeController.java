package mini_project.controller;
import java.awt.event.*;
import mini_project.model.Rotatable;

public class ShapeController implements KeyListener{

    protected Rotatable rotatable;

    public ShapeController(Rotatable rotatable){
        this.rotatable = rotatable;
    }

    public void keyPressed(KeyEvent e) {
        System.out.println("here");
        if(e.getKeyCode()== KeyEvent.VK_RIGHT)
            rotatable.rotateRight();
        else if(e.getKeyCode()== KeyEvent.VK_LEFT)
            rotatable.rotateLeft();
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

}
