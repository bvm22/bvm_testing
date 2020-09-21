package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Класс родитель для всех страниц
 * */
public class Page {

    protected WebDriver driver;

    public Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
