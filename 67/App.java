package com.mycompany.mavenproject1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;

public class App extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
       
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/mycompany/mavenproject1/menu.fxml"));
       
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        
        //ETO PANG ADD NG LOGO SA APP
        //Image iconImage = new Image(getClass().getResourceAsStream("/com/goat/project/system/images/diosarapIcon.png"));
        //stage.getIcons().add(iconImage);
        //stage.setTitle("Sales and Records Management System");
        
        //PANG ADD TO NG CSS ITONG CODE
        //scene.getStylesheets().add(getClass().getResource("/com/goat/project/system/css/loginPane.css").toExternalForm());
        
        stage.show();
    }
}