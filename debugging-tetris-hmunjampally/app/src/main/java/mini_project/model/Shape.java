package mini_project.model;
import java.util.ArrayList;

import mini_project.Observer;

public class Shape implements Rotatable{
    protected int rows;
    protected int cols;
    protected Grid []rotations;
    private int rotationIndex;
    private ArrayList<Observer> observers;

    public Shape(int rows, int cols, int numRotations){
        this.rows = rows;
        this.cols = cols;
        this.rotations = new Grid[numRotations];
        for (int i = 0; i < numRotations; i++){
            this.rotations[i] = new Grid(rows, cols);
        }
        observers = new ArrayList<Observer>();
    }

    public int getRows(){return this.rows;}
    public int getColumns(){return this.cols;}
    public boolean isOccupied(int row, int col){return this.rotations[rotationIndex].get(row,col);}

    public void rotateRight(){
       rotationIndex = (rotationIndex + 1) % this.rotations.length;
       notifyObservers();
    }

    public void rotateLeft(){
        rotationIndex = (rotationIndex - 1);
        if (rotationIndex < 0){
            rotationIndex = this.rotations.length-1;
        }
        notifyObservers();
    }

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyObservers(){
        for (Observer o: observers){
            o.update();
        }
    }
}
