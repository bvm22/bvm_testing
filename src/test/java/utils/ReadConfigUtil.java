package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigUtil {

    private static final Properties prop;
    private static FileInputStream fis;

    static {
        prop = new Properties();
        try {
            fis = new FileInputStream("src/test/java/resources/config.properties");
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * читает значение из файла config.properties
     *
     * @param value - имя
     * @return значение по выбранному имени
     */
    public synchronized static String getValueFromConfig(String value) {
        return prop.getProperty(value);
    }

}
