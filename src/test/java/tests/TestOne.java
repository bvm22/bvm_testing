package tests;

import io.qameta.allure.Owner;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pages.YandexImageSearchResult;
import pages.YandexImagesPage;
import pages.YandexMainPage;
import testData.Image;
import utils.GeneratorTestData;
import utils.Helper;


import java.util.List;

@Owner("Vladimir")
public class TestOne extends MainTest {

    //генерация ТД
    List<Image> images = GeneratorTestData.getImages();

    @Test
    @DisplayName("Yandex image search")
    public void tk1() {
        //забираем картинку по ключу. Здесь конечно нет никакой проверки на пустой массив. Но предположим, что мы всегда
        //знаем, что ТД у нас есть и они имеют название, соответствующее ожидаемому в результатах поиска Яндекса.
        Image image = images.get(2);
        new YandexMainPage(driver).clickImageSearch();
        Helper.switchToNewTab(driver);
        YandexImagesPage yandexImagesPage = new YandexImagesPage(driver);
        yandexImagesPage.searchImage();
        yandexImagesPage.inputImage(image);
        new YandexImageSearchResult(driver).checkBullits(image);
    }
}
