package com.example.rpgminigame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws IOException, ParseException {
        //launch();
        /*JSONObject levelsJsonObject = new JSONObject();
        try{
            levelsJsonObject = JSONHandler.ReadFromJSON("test.json");
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(levelsJsonObject);*/
        LevelEditor.GenerateJSONFileFromGUI();

    }
}