package controllers.login;

public class LoginController {

    public boolean checkUserNameandPassword(String name, String password) {
        if(name.equals("Tharu") && password.equals("1234")){
            return true;
        }
            return false;

    }
}
