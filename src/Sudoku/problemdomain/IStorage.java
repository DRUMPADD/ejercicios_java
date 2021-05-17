package Sudoku.problemdomain;

import java.io.IOException;

public interface IStorage {
    void UpdateGameata(SudokuGame game) throws IOException;
    SudokuGame getGameData() throws IOException;
}
