package tic_tac_toe;

public enum TicTacToePiece {
    X("X"), 
    O("O"); 

    private final String piece;
    TicTacToePiece(String name)
    {
       this.piece = name;
    }
}

