package mini_project.model;



public class Square extends Shape implements Rotatable{

    public Square(){
        super(3,3,4);
        initRotation1();
        initRotation2();
        initRotation3();
        initRotation4();

    }
    private void initRotation1(){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                this.rotations[0].set(i, j);
            }
        }
    }
    private void initRotation2(){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                this.rotations[1].set(i,j);
            }
        }
    }
     private void initRotation3(){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                this.rotations[2].set(i,j);
            }
        }
    }
     private void initRotation4(){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                this.rotations[3].set(i,j);
            }
        }
    }
       
}