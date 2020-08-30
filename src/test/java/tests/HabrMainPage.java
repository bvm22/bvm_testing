package test.java.tests;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HabrMainPage {

    @FindBy(xpath = "//div[@class=\"main-navbar__section main-navbar__section_right\"]//a[.=\"Войти\"]")
    private WebElement signIn;

    @FindBy(xpath = "//input[@name=\"email\"]")
    private WebElement email;

    @FindBy(xpath = "//input[@name=\"password\"]")
    private WebElement password;

    @FindBy(xpath = "//button[contains(text(),\"Войти\")]")
    private WebElement submit;


    @Step("Клик по кнопке Войти")
    public void signIn() {
        signIn.click();
    }

    @Step("Заполнение поля Логин")
    public void inputLogin(String value) {
        email.sendKeys(value);
    }

    @Step("Заполнение поля Пароль")
    public void inputPassword(String value) {
        password.sendKeys(value);
        ;
    }

    @Step("Submit")
    public void submit() {
        submit.click();
    }
}
