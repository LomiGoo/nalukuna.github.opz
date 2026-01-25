package com.mycompany.mavenproject1;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author CLienT 
 */
public class menuController {
 @FXML
private BorderPane main;

@FXML
private void openRequestForm(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(
        getClass().getResource("RequestForm.fxml")
    );

    Stage stage = (Stage) ((Node) event.getSource())
            .getScene().getWindow();

    stage.setScene(new Scene(root));
    stage.show();
}
}
    

