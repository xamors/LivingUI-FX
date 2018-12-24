import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Functionality extends Frame {

    TextField Name,Strength,Dexteriy,Intelligence,Constitution,Wisdom,Charisma;
    Label NameL, StrengthL;

    public void Components(){

        NameL = new Label("Name");
        Name = new TextField("Name");
        StrengthL = new Label("Strength");
        Strength = new TextField("Strength");
        layout.add(NameL,0,0);
        layout.add (Name, 1,0);
        layout.add(StrengthL,0,1);
        layout.add (Strength, 1,1);
        GridPane.setMargin(Name, new Insets(10,10,10,10));
        GridPane.setMargin(NameL, new Insets(0,0,0,10));
        GridPane.setMargin(StrengthL, new Insets(0,0,0,10));
        GridPane.setMargin(Strength, new Insets(0,0,0,15));

    }

}
