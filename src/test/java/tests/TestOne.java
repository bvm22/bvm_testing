package test.java.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import test.java.pages.HabrLoginPage;
import test.java.pages.HabrMainPage;

@Owner("Vladimir")
public class TestOne extends MainTest {

    @Test
    @DisplayName("Habr Login Try")
    public void tk1() {
        driver.get("https://www.habr.com/");
        new HabrMainPage(driver).signIn();
        HabrLoginPage habrLoginPage = new HabrLoginPage(driver);
        habrLoginPage.inputLogin("bvm.off@gmail.com");
        habrLoginPage.inputPassword("qwerty");
        habrLoginPage.submit();
        System.out.println();
    }
}
