package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import utils.ChromeDriverUtil;
import utils.ReadConfigUtil;

public class MainTest {

    public static final String PATH_TO_CHROME_DRIVER = ReadConfigUtil.getValueFromConfig("chromedriver");

    protected WebDriver driver;

    @Before
    public void started(){
        driver = ChromeDriverUtil.startChromeDriver();
        driver.get("https://yandex.ru/");
    }

    @After
    public void finished(){
        try {
            if (driver != null) {
                driver.quit();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
