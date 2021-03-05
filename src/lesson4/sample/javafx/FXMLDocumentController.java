package lesson4.sample.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FXMLDocumentController {
    
    @FXML
    private Label label12;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label12.setText("Hello World!");
    }
    
}