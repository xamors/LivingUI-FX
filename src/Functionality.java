import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Functionality extends Frame {

    TextField Name,Strength,Dexterity,Intelligence,Constitution,Wisdom,Charisma, RollT;
    TextField D4L,D6L,D8L,D10L,D12L,D20L;
    Label NameL, StrengthL,DexterityL,IntelligenceL,ConstitutionL,WisdomL,CharismaL;
    Button Roll;
    CheckBox D4, D6, D8, D10, D12, D20;
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
        Roll = new Button("Roll");
        RollT = new TextField("");
        D4 = new CheckBox("D4");
        D6 = new CheckBox("D6");
        D8 = new CheckBox("D8");
        D10 = new CheckBox("D10");
        D12 = new CheckBox("D12");
        D20 = new CheckBox("D20");
        D4L = new TextField("");
        D6L = new TextField("");
        D8L = new TextField("");
        D10L = new TextField("");
        D12L = new TextField("");
        D20L = new TextField("");
        Roll.setPrefWidth(100);
        Roll.setPrefHeight(30);


        layout.add(NameL,0,0);
        layout.add(Name, 1,0);
        layout.add(StrengthL,0,1);
        layout.add(Strength, 1,1);
        layout.add(DexterityL,0,2);
        layout.add(Dexterity, 1,2);
        layout.add(IntelligenceL,0,3);
        layout.add(Intelligence, 1,3);
        layout.add(ConstitutionL,0,4);
        layout.add(Constitution, 1,4);
        layout.add(WisdomL,0,5);
        layout.add(Wisdom, 1,5);
        layout.add(CharismaL,0,5);
        layout.add(Charisma, 1,5);
        layout.add(Roll,0,6);
        layout.add(RollT,1,6);
        layout.add(D4,0,6);
        layout.add(D6,0,6);
        layout.add(D8,0,6);
        layout.add(D10,0,6);
        layout.add(D12,0,6);
        layout.add(D20,0,6);
        layout.add(D4L, 1,6);
        layout.add(D6L, 1,6);
        layout.add(D8L, 1,6);
        layout.add(D10L, 1,6);
        layout.add(D12L, 1,6);
        layout.add(D20L, 1,6);



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
        GridPane.setMargin(Roll, new Insets(475,0,0,10));
        GridPane.setMargin(RollT, new Insets(475,0,0,5));
        GridPane.setMargin(D4, new Insets(350,0,0,10));
        GridPane.setMargin(D6, new Insets(300,0,0,10));
        GridPane.setMargin(D8, new Insets(250,0,0,10));
        GridPane.setMargin(D10, new Insets(200,0,0,10));
        GridPane.setMargin(D12, new Insets(150,0,0,10));
        GridPane.setMargin(D20, new Insets(100,0,0,10));
        GridPane.setMargin(D4L, new Insets(450,0,100,10));
        GridPane.setMargin(D6L, new Insets(400,0,100,10));
        GridPane.setMargin(D8L, new Insets(350,0,100,10));
        GridPane.setMargin(D10L, new Insets(300,0,100,10));
        GridPane.setMargin(D12L, new Insets(250,0,100,10));
        GridPane.setMargin(D20L, new Insets(200,0,100,10));
    }

}
