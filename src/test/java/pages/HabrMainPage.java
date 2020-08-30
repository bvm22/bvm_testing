package test.java.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.java.pages.Page;

public class HabrMainPage extends Page {

    public HabrMainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class=\"main-navbar__section main-navbar__section_right\"]//a[.=\"Войти\"]")
    private WebElement signIn;

    @Step("Клик по кнопке Войти")
    public void signIn() {
        signIn.click();
    }

}
