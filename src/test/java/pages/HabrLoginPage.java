package test.java.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HabrLoginPage extends Page {

    public HabrLoginPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "//input[@name=\"email\"]")
    private WebElement email;

    @FindBy(xpath = "//input[@name=\"password\"]")
    private WebElement password;

    @FindBy(xpath = "//button[contains(text(),\"Войти\")]")
    private WebElement submit;

    @Step("Заполнение поля Логин")
    public void inputLogin(String value) {
        email.sendKeys(value);
    }

    @Step("Заполнение поля Пароль")
    public void inputPassword(String value) {
        password.sendKeys(value);
    }

    @Step("Submit")
    public void submit() {
        submit.click();
    }
}
