package mini_project.model;
import mini_project.Observer;
import java.util.ArrayList;

public class Shape implements Rotatable{
    protected int rows;
    protected int cols;
    protected int numRotations;
    protected Grid []rotations;
    protected int rotationIndex;

    private ArrayList<Observer> observers;

    public Shape(int rows, int col, int rotate){
        this.rows = rows;
        this.cols = col;
        this.numRotations=rotate;
        this.rotations = new Grid[numRotations];
        for (int i = 0; i < 4; i++){
            this.rotations[i] = new Grid(rows, cols);
        }
        observers = new ArrayList<Observer>();
    }

    public int getRows(){return this.rows;}
    public int getColumns(){return this.cols;}
    public boolean isOccupied(int row, int col){return this.rotations[rotationIndex].get(row,col);}

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyObservers(){
        for (Observer o: observers){
            o.update();
        }
    }

    public void rotateRight(){
       rotationIndex = (rotationIndex + 1) % this.rotations.length;
       notifyObservers();
    }

    public void rotateLeft(){
        rotationIndex = (rotationIndex - 1);
        if (rotationIndex < 0){
            rotationIndex = this.rotations.length - 1;
        }
        notifyObservers();
    }
}

