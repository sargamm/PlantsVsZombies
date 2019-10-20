import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;

import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import java.io.*;
import javafx.application.*;
import javafx.event.*;

public class StartPageController {
    @FXML
    private static Pane rootStartPagePane;
    @FXML
    private static StackPane topPane;
    @FXML
    private static StackPane middlePane;
    @FXML
    private static StackPane bottomPane;
    @FXML
    private void handleStartGame(ActionEvent event){
        FXMLLoader loader= new FXMLLoader(getClass().getResource("PlayGamePage.fxml"));
        Parent root=null;
        try{
            root=loader.load();
        }
        catch(IOException e){
            e.printStackTrace();
            System.exit(0);
        }
        Game.updateStage(root,640,379);
    }
    @FXML
    private void handleLoadGame(ActionEvent event){
        System.exit(0);
    }
    @FXML
    private void handleExitGame(ActionEvent event){
        System.exit(0);
    }
}