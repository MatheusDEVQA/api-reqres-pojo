package steps;

import org.junit.jupiter.api.Test;
import support.dominio.User;

import static support.base.Environments.USER_PATH;
import static support.utils.Request.*;
import static support.utils.Asserts.*;

public class CreateUserTest {

    @Test
    public void createUserSuccess() {

        User user = new User("Matheus", "Qa Engineer");

        postRequestBodyContentJsonUri(USER_PATH, 201, user, "user");

        assertValueBody("name", user.getName());
        assertValueBody("job", user.getJob());
    }

    @Test
    public void createUserWithoutNameAndJobBadRequest() {

        User user = new User();

        postRequestBodyContentJsonUri(USER_PATH, 400, user, "user");

    }
}
