package test.java.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import test.java.utils.ChromeDriverUtil;
import test.java.utils.ReadConfigUtil;

public class MainTest {

    public static final String PATH_TO_CHROME_DRIVER = ReadConfigUtil.getValueFromConfig("chromedriver");

    protected WebDriver driver;

    @BeforeEach
    public void started(){
        driver = ChromeDriverUtil.startChromeDriver();
    }

    @AfterEach
    public void finished(){
        try {
            if (driver != null) {
                driver.quit();
            }
        } catch (Exception e) {

        }
    }



}
