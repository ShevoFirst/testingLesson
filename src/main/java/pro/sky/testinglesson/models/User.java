package pro.sky.testinglesson.models;

import java.util.regex.Pattern;

public class User {
    String login;
    String email;
    Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
            "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

    public User(String login, String email) {
        this.login = login;
        if(pattern.matcher(email).matches()){
            this.email = email;
        }else throw new RuntimeException("не корректный формат email");
    }
}
