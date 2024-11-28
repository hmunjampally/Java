package mini_project.model;

public class Grid{
    protected boolean [][]cells;
    protected int rows;
    protected int cols;

    public Grid(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.cells = new boolean[rows][cols];
    }

    public void clear(){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                cells[i][j] = false;
            }
        }
    }

    public void set(int row, int col){
        cells[row][col] = true;
    }

    public boolean get(int row, int col){
        return cells[row][col];
    }

    public int getRows(){return rows;}
    public int getCols(){return cols;}
}
