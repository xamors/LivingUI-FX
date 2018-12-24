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

    TextField Name,Strength,Dexterity,Intelligence,Constitution,Wisdom,Charisma;
    Label NameL, StrengthL,DexterityL,IntelligenceL,ConstitutionL,WisdomL,CharismaL;

    public void Components(){

        NameL = new Label("Name");
        Name = new TextField("Name");
        StrengthL = new Label("Strength");
        Strength = new TextField("Strength");
        DexterityL = new Label("Dexterity");
        Dexterity = new TextField("Dexterity");
        IntelligenceL = new Label("Intelligence");
        Intelligence = new TextField("Intelligence");
        ConstitutionL = new Label("Constitution");
        Constitution = new TextField("Constitution");
        WisdomL = new Label("Wisdom");
        Wisdom = new TextField("Wisdom");
        CharismaL = new Label("Wisdom");
        Charisma = new TextField("Wisdom");

        layout.add(NameL,0,0);
        layout.add (Name, 1,0);
        layout.add(StrengthL,0,1);
        layout.add (Strength, 1,1);
        layout.add(DexterityL,0,2);
        layout.add (Dexterity, 1,2);
        layout.add(IntelligenceL,0,3);
        layout.add (Intelligence, 1,3);
        layout.add(ConstitutionL,0,4);
        layout.add (Constitution, 1,4);
        layout.add(WisdomL,0,5);
        layout.add (Wisdom, 1,5);
        layout.add(CharismaL,0,5);
        layout.add (Charisma, 1,5);

        GridPane.setMargin(Name, new Insets(10,10,10,15));
        GridPane.setMargin(NameL, new Insets(0,0,0,10));
        GridPane.setMargin(StrengthL, new Insets(0,0,0,10));
        GridPane.setMargin(Strength, new Insets(0,0,0,15));
        GridPane.setMargin(DexterityL, new Insets(5,0,0,10));
        GridPane.setMargin(Dexterity, new Insets(10,0,0,15));
        GridPane.setMargin(IntelligenceL, new Insets(5,0,0,10));
        GridPane.setMargin(Intelligence, new Insets(10,0,0,15));
        GridPane.setMargin(ConstitutionL, new Insets(5,0,0,10));
        GridPane.setMargin(Constitution, new Insets(10,0,0,15));
        GridPane.setMargin(WisdomL, new Insets(5,0,0,10));
        GridPane.setMargin(Wisdom, new Insets(10,0,0,15));
        GridPane.setMargin(CharismaL, new Insets(5,0,0,10));
        GridPane.setMargin(Charisma, new Insets(10,0,0,15));
    }

}
