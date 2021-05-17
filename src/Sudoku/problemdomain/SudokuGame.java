package Sudoku.problemdomain;

import java.io.Serializable;

public class SudokuGame implements Serializable{
    private final GameState gameState;
    private final int [][] gridState;
    
    public static final int GRID_BOUNDARY = 9;
    
    public SudokuGame(GameState gameState, int[][] gridState){
        this.gameState = gameState;
        this.gridState = gridState;
    }
    
    public GameState getgameState() {
        return gameState;
    }
    
    public int[][] getGridState() {
        return SudokuUtilities.copyToNewArray(gridState);
    }
}
