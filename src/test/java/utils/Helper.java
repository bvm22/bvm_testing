package utils;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import java.util.Set;

/**
 * Вспомогательный класс для работы с браузером
 * */
public class Helper {

    @Step("Переход к новой вкладке браузера")
    public static String switchToNewTab(WebDriver driver) {
        String originalWindow = driver.getWindowHandle();
        Set<String> originalWindows = driver.getWindowHandles();
        for (String window : originalWindows){
            if (!window.equals(originalWindow)){
                driver.switchTo().window(window);
            }
        }
        return originalWindow;
    }



}
