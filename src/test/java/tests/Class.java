package test.java.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


@Owner("Zalupa")
public class Class {

    WebDriver driver = new ChromeDriver();


    @Test
    @DisplayName("Test test test")
    public void Test(){
        driver.manage().window().maximize();
        driver.get("https://habr.com/");
        HabrMainPage habrMainPage = PageFactory.initElements(driver, HabrMainPage.class);
        habrMainPage.signIn();
        habrMainPage.inputLogin("bvm.off@gmail.com");
        habrMainPage.inputPassword("6eed9ae73db6");
        habrMainPage.submit();
        System.out.println("qwe");

    }





}
