package mini_project.model;

public class BarShape extends Shape implements Rotatable{
    
    public BarShape(){
        super(4,4,4);
        initRotation1();
        initRotation2();
        initRotation3();
        initRotation4();
    }

    private void initRotation1(){
        for (int i = 0; i < 4; i++){
            this.rotations[0].set(0, i);
        }
    }

    private void initRotation2(){
        for (int i = 0; i < 4; i++){
            this.rotations[1].set(i, 0);
        }
    }

    private void initRotation3(){
        for (int i = 0; i < 4; i++){
            this.rotations[2].set(0, i);
        }
    }

    private void initRotation4(){
        for (int i = 0; i < 4; i++){
            this.rotations[3].set(i, 0);
        }
    }
}



