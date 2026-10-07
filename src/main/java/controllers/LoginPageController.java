package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginPageController {

    @FXML
    private Button login;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField userName;

    @FXML
    void LoginOnaction(ActionEvent event) {
        String name = userName.getText();
        String password = txtPassword.getText();
        boolean b = checkUserNameandPassword(name,password);

        if(b){
            Stage stage = new Stage();
            try{
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/home_page.fxml"))));
            }catch (IOException e){
                throw new RuntimeException(e);
            }
            stage.show();


        }
    }

    private boolean checkUserNameandPassword(String name, String password) {
        if(name.equals("Tharu") && password.equals("1234")){
            return true;
        }
        return false;
    }

}
