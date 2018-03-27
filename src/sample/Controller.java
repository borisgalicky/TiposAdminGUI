package sample;

import javafx.scene.control.PasswordField;
import javafx.event.ActionEvent;
import java.awt.*;

public class Controller{
    public Button submit_button;
    public TextField login_input;
    public PasswordField password_input;
    public void checkData(ActionEvent event){
        System.out.println("You pressed 'Submit' button!");
    }
}
