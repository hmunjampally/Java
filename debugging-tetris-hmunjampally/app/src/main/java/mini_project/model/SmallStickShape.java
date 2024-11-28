package mini_project.model;

public class SmallStickShape extends Shape{
    public SmallStickShape(){
        super(2, 2, 2);
        initRotation1();
        initRotation2();
    }

    private void initRotation1(){
        // now initialize the stick part of the shape
        for (int i = 0; i < 2; i++){
            this.rotations[0].set(i,1);
        }
    }

    private void initRotation2(){
        for (int i = 0; i < 2; i++){
            this.rotations[1].set(1,i);
        }
    }
}
