import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;


public class Frame extends Application {

    public static GridPane layout;


    @Override
    public void start(Stage newStage) throws Exception {
            layout = new GridPane();
            Scene scene = new Scene(layout, 1920, 1080);
            newStage = new Stage();
            newStage.setTitle("LivingUI");
            Functionality addCon = new Functionality();
            addCon.Components();
            newStage.setScene(scene);
            newStage.show();
    }
}

