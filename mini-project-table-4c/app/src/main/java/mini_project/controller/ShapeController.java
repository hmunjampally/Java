package mini_project.controller;
import java.awt.event.*;
import mini_project.model.Rotatable;


public class ShapeController implements KeyListener{
    protected Rotatable rotate;

    public ShapeController(Rotatable rotate){
        this.rotate = rotate;
    }

    public void keyPressed(KeyEvent e) {
        System.out.println("here");
        if(e.getKeyCode()== KeyEvent.VK_RIGHT)
            rotate.rotateRight();
        else if(e.getKeyCode()== KeyEvent.VK_LEFT)
            rotate.rotateLeft();

    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

}
