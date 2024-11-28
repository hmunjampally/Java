package mini_project.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import mini_project.model.Field;
import mini_project.Observer;

public class FieldPanel extends JPanel implements Observer{

    protected Field field;

    public FieldPanel(Field field){
        this.field = field;
        this.setLayout(new GridLayout(field.getRows(), field.getCols()));
        field.registerObserver(this);
        update();
    }
    
    public void update(){
        this.removeAll();
        for (int i = 0; i < field.getRows(); i++){
            for (int j = 0; j < field.getCols(); j++){
                if (field.get(i, j)){
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
