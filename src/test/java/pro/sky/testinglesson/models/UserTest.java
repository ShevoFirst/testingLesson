package pro.sky.testinglesson.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {
        String correctLogin = "Dima";
        String correctEmail = "dima@yandex.ru";
        String unCorrectLogin = "123";
        String unCorrectEmail = "dimayandex.ru";
        User user = new User(correctLogin, correctEmail);
        @Test
        void  createUserTest(){
            Assertions.assertNotNull(user);
        }
        @Test
        void  nullCreateUserTest(){
            User user1 = new User();
            Assertions.assertNull(user1.getLogin());
            Assertions.assertNull(user1.getEmail());
        }
        @Test
        void  checkCorrectMailTest(){
            Assertions.assertDoesNotThrow(()-> new User(correctLogin, correctEmail));
        }
        @Test
        void  checkUnCorrectMailTest(){
            Assertions.assertThrows(RuntimeException.class, () -> new User(unCorrectLogin,unCorrectEmail));
        }
        @Test
        void  doesNotEqualsLoginAndEmail(){
            Assertions.assertNotEquals(user.getLogin(),user.getEmail());
        }

}