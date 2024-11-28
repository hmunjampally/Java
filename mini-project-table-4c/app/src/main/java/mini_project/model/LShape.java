
package mini_project.model;

public class LShape extends Shape implements Rotatable{
    
    public LShape(){

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
        this.rotations[0].set(0,2);
    }

    private void initRotation2(){
        for (int i = 0; i < 3; i++){
            this.rotations[1].set(1,i);
        }
        this.rotations[1].set(2,2);
    }

    private void initRotation3(){
        for (int i = 0; i < 3; i++){
            this.rotations[2].set(i,1);
        }
        this.rotations[2].set(2,0);
    }
    private void initRotation4(){
        for (int i = 0; i < 3; i++){
            this.rotations[3].set(1,i);
        }
        this.rotations[3].set(0,0);
    }
}
