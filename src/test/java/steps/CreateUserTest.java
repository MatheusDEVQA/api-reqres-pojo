package steps;

import org.junit.jupiter.api.Test;
import support.dominio.User;

import static support.utils.Request.postRequestBodyContentJsonUri;

public class CreateUserTest {

    @Test
    public void createUserSucess(){

        User user = new User("Matheus","Qa Engineer");

        postRequestBodyContentJsonUri("/api/users",201,user);


    }
}
