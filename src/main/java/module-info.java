module com.example.rpgminigame {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;
    requires java.desktop;


    opens com.example.rpgminigame to javafx.fxml;
    exports com.example.rpgminigame;
}