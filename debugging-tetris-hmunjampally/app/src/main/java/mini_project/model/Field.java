package mini_project.model;
import java.util.ArrayList;
import mini_project.Observer;

public class Field extends Grid{
    private ArrayList<Observer> observers;
    private Shape flyingShape;
    private int xTopLeft;
    private int yTopLeft;

    public Field(int rows, int cols){
        super(rows, cols);
        observers = new ArrayList<Observer>();
        flyingShape = null;
    }

    public void addShape(Shape shape, int x, int y){
       this.flyingShape = shape;
       xTopLeft = x;
       yTopLeft = y;
       for (Observer observer: observers){
            this.flyingShape.registerObserver(observer);
       }
    }

    public void registerObserver(Observer observer){
        observers.add(observer);
        if (flyingShape != null){
            flyingShape.registerObserver(observer);
        }
    }

    public void notifyObservers(){
        for (Observer o: observers){
            o.update();
        }
    }

   public void mergeFlyingShape(){
       for (int i = 0; i < this.flyingShape.getRows(); i++){
           for (int j = 0; j < this.flyingShape.getColumns(); j++){
               if (this.flyingShape.isOccupied(i, j)){
                   this.set(xTopLeft+i, yTopLeft+j);
               }
           }
       }
       this.flyingShape = null;
       notifyObservers();
   }

   @Override
   public boolean get(int row, int col){
      boolean isOccupied = super.get(row, col);
      if (!isOccupied && flyingShape != null){
         if ((row >= xTopLeft && row < xTopLeft + flyingShape.getRows()) &&
            (col >= yTopLeft && col < yTopLeft + flyingShape.getColumns())){
            int xFromShape = row - xTopLeft;
            int yFromShape = col - yTopLeft;
            isOccupied = flyingShape.isOccupied(xFromShape, yFromShape);
         } 
      }
      return isOccupied;
   }

}
