package support.utils;

import static org.junit.jupiter.api.Assertions.*;
import static support.utils.Request.response;

public class Asserts {

    public static void assertValueBody(String key, String value){
        assertEquals(value, response.body().path(key).toString());
    }

    public static void assertValueNotNullBody(String key){
        assertNotNull( response.body().path(key).toString());
    }

}
