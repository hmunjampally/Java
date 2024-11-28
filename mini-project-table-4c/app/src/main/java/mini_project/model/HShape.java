
package mini_project.model;

public class HShape extends Shape implements Rotatable{
   
    public HShape(){
        super(3,3,4);
        initRotation1();
        initRotation2();
        initRotation3();
        initRotation4();
    }

    private void initRotation1(){
        // now initialize the L part of the shape
        for (int i = 0; i < 3; i++){
            this.rotations[0].set(i,1);
        }
        this.rotations[0].set(1,2);
    }

    private void initRotation2(){
        for (int i = 0; i < 3; i++){
            this.rotations[1].set(1,i);
        }
        this.rotations[1].set(0,1);
    }

    private void initRotation3(){
        for (int i = 0; i < 3; i++){
            this.rotations[2].set(i,1);
        }
        this.rotations[2].set(1,0);
    }
    private void initRotation4(){
        for (int i = 0; i < 3; i++){
            this.rotations[3].set(1,i);
        }
        this.rotations[3].set(2,1);
    }
}
