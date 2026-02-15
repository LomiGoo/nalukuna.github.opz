package com.mycompany.mavenproject1;



import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NotificationsController {

    @FXML
    private ListView<String> notificationList; // Matches the fx:id in XML

    @FXML // <--- This is required!
    private void handleHome(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/mycompany/mavenproject1/menu.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    
    



