
package Sudoku;

import java.io.IOException;
import javafx.application.Application;


public class SudokuApplication extends Application{
    
    private IUserInterfaceContract.View uiImpl;
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        uiImpl = new UserInterfaceImpl(primaryStage);
        try {
            SudokuBuildLogic.build(uiImpl);
        } catch(IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
    
    public static void main(String [] args) {launch(args);}
}
