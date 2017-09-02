package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    private @FXML TextField inputText;
    public Controller() {
        getText();

    }
    public void getText(){
        System.out.println(this.inputText);

    }
}
