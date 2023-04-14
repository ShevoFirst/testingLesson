package pro.sky.testinglesson.models;

import lombok.Data;

import java.util.regex.Pattern;

@Data
public class User {
    private String login;
    private String email;

    public User(String login, String email) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
                "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        this.login = login;
        if(pattern.matcher(email).matches()){
            this.email = email;
        }else throw new RuntimeException("не корректный формат email");
    }
    public User(){
    }
}
