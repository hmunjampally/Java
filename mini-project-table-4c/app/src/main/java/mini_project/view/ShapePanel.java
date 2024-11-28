package mini_project.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import mini_project.model.Shape;

import mini_project.Observer;

public class ShapePanel extends JPanel implements Observer{

    protected Shape shape;

    public ShapePanel(Shape shape){
       
        this.shape = shape;
      
        this.setLayout(new GridLayout(shape.getRows(), shape.getColumns()));
        shape.registerObserver(this);
        update();
    }
    
    public void update(){
        this.removeAll();
        for (int i = 0; i < shape.getRows(); i++){
            for (int j = 0; j < shape.getColumns(); j++){
                if (shape.isOccupied(i, j)){
                    this.add(new ColoredSquare(30));
                }
                else{
                    this.add(new JLabel(""));
                }

            }
        }
        this.revalidate();
        this.repaint();
    }
}

