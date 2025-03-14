package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
    private static Properties properties;

    static {
        try (FileInputStream file = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace1\\TDDframeworkSeleniumExample\\src\\main\\resources\\config.properties")) {
            properties = new Properties();
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load config.properties file.");
        }
    }

    public static  String getProperty(String key) {
        return properties.getProperty(key);
    }

	
}
