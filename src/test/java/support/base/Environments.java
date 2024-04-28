package support.base;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Environments {
    public static Properties prop = new Properties();

    public static String BASE_URL;
    public static String USER_PATH;

    private Properties properties;

    static {
        String propertiesPath = "/application.properties";
        InputStream is = Environments.class.getResourceAsStream(propertiesPath);
        try {
            prop.load(is);
            setEnvironmentVariables();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void setEnvironmentVariables() {
        BASE_URL = prop.getProperty("BASE_URL");
        USER_PATH = prop.getProperty("USER_PATH");

    }

    private static String get(String propKey) {
        return prop.getProperty(propKey);
    }
}