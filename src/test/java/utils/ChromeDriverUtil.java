package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static tests.MainTest.PATH_TO_CHROME_DRIVER;

/**
 * класс для распаковки в проекте WebDriver
 */
public class ChromeDriverUtil {

    /**
     * возвращает ChromeDriver для запуска и работы браузера
     *
     * @return готовый для работы вебдрайвер
     */
    public static WebDriver startChromeDriver() {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", PATH_TO_CHROME_DRIVER);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

    }

}
