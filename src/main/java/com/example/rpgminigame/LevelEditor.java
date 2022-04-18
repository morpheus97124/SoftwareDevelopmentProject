package com.example.rpgminigame;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class LevelEditor extends Application implements EventHandler<ActionEvent> {
    Button buttonOpenFile = new Button("Open");
    TextField textfieldSaveName = new TextField();
    Button buttonEnd = new Button("Save");


    @Override
    public void start(Stage stage) throws IOException {
        /*
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        */
        //StackPane stackPane = new StackPane();//on top of each other
        VBox vbox = new VBox();//in a vertical line
        HBox hboxMenu = new HBox();
        hboxMenu.setPadding(new Insets(20));
        hboxMenu.setSpacing(20);
        VBox vboxDown = new VBox();
        textfieldSaveName.setMaxWidth(300);
        vbox.getChildren().add(hboxMenu);

        vbox.getChildren().add(vboxDown);
        buttonOpenFile.setOnAction(this);
        buttonEnd.setOnAction(this);

        hboxMenu.getChildren().add(buttonOpenFile);
        hboxMenu.getChildren().add(textfieldSaveName);
        hboxMenu.getChildren().add(buttonEnd);
        
        Scene scene = new Scene(vbox, 500,500);
        stage.setTitle("Level Editor app for the RPG Mini Game");
        stage.setScene(scene);
        stage.show();
    }

    public static void GenerateJSONFileFromGUI(){
        launch();
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if(actionEvent.getSource()== buttonOpenFile){
            FileChooser fileChooser = new FileChooser();
            File file = fileChooser.showOpenDialog(null);
        }
        if(actionEvent.getSource()==buttonEnd){
            System.out.println("buttonEnd has been pressed");
        }
    }
}