package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test.java.testData.Image;

public class YandexImagesPage extends Page {

    public YandexImagesPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "//button[@aria-label=\"Поиск по картинке\"]")
    private WebElement imagesSearchLocator;

    @FindBy(xpath = "//input[@name=\"upfile\"]")
    private WebElement inputFileLocator;


    @Step("Клик Поиск по картинке")
    public void searchImage() {
        imagesSearchLocator.click();
    }

    @Step("Вложение файла")
    public void inputImage(Image image){
        inputFileLocator.sendKeys(image.getPath());


    }
}
