package com.example.rpgminigame;

import javafx.stage.FileChooser;
import java.io.File;

public class ButtonController {
    protected static File onFileExplorerOpen(){
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(null);
        return file;
    }
    protected void onSaveMapToJSON(){
        //TODO
    }
}
