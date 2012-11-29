package com.bitbucket.shemnon.jfx.sample.fullyexpressed;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class TheMain extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setResources(ResourceBundle.getBundle("com.bitbucket.shemnon.jfx.sample.fullyexpressed.TheResources"));
        StackPane pane = (StackPane) fxmlLoader.load(this.getClass().getResource("theScene.fxml").openStream());

        Scene scene = new Scene(pane);
        scene.getStylesheets().setAll(
                getClass().getResource("theStyles.css").toExternalForm());
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(TheMain.class, args);

    }
}