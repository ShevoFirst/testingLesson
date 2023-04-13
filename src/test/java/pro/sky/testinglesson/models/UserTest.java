package pro.sky.testinglesson.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
        String login = "Dima";
        String email = "dima@yandex.ru";
        User user = new User(login, email);
        @Test
        void  createUserTest(){
            Assertions.assertNotNull(user);
        }
        @Test
        void  failCreateUserTest(){
            User user = null;
            Assertions.assertNull(user);
        }
        @Test
        void  checkCorrectMailTest(){
            Assertions.assertDoesNotThrow(()-> new User(login,email));
        }
        @Test
        void  doesNotEqualsLoginAndEmail(){
            Assertions.assertNotEquals(user.login,user.email);
        }

}