package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


public class Controller{

    @FXML
    TextArea john;

    @FXML
    Button readButton;

    @FXML
    Button writeButton;


    public void ReadFile(ActionEvent actionEvent) {



        john.setText("hej");

    }
}
