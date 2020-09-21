package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class YandexMainPage extends Page {

    public YandexMainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[.=\"Картинки\"]")
    private WebElement images;

    @Step("Клик по кнопке Картинки")
    public void clickImageSearch() {
        images.click();
    }

}
