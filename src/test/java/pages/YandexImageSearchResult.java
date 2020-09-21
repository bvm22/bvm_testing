package pages;

import io.qameta.allure.Step;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import testData.Image;

import java.util.List;

public class YandexImageSearchResult extends Page {

    public YandexImageSearchResult(WebDriver driver) {
        super(driver);
    }

    @FindAll(@FindBy(xpath = "//div[div[.=\"Кажется, на картинке\"]]//a/span"))
    private List<WebElement> bullits;

    @Step("проверка буллитов")
    public void checkBullits(Image image){
        int count = 0;
        for(WebElement element : bullits){
            System.out.println(element.getText());
            if (element.getText().contains(image.getName())){
                count++;
            }
            Assert.assertTrue(count>0);
        }
    }

}
