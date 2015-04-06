package ru.electronics.onliner.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * autor:maksim
 * date: 06.04.15
 * time: 18:23.
 */
public class Main extends Application {
    private Stage primaryStage;
    private AnchorPane anchorPane;

    @Override
    public void start(Stage stage) throws Exception {
        this.primaryStage = stage;
        this.primaryStage.setTitle("Onliner");
        initRootLayout();
    }

    public void initRootLayout() throws IOException {
        FXMLLoader fxmlLoader=new FXMLLoader();
        fxmlLoader.setLocation(this.getClass().getResource("/main_layout.fxml"));
        anchorPane=(AnchorPane)fxmlLoader.load();
        Scene scene=new Scene(anchorPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
