package ru.yandex.test.step;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.test.page.YaAfishaFilmPage;
import ru.yandex.qatools.allure.annotations.Step;

import static ru.yandex.test.step.BaseStep.webDriver;

public class YaAfishaFilmStep {
    @Step("Нажата кнопка закрытия рекламы")
    public void clickReklama()
    {
        new WebDriverWait(webDriver,3).until(ExpectedConditions.visibilityOf(new YaAfishaFilmPage().closeB));
        new YaAfishaFilmPage().closeB.click();

    }


    @Step("заголовок страницы  равен {0}")
    public void aasertTitle()
    {
        String strTitle = new YaAfishaFilmPage().titleFilmMoscow.getText();
        Assert.assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                strTitle, "Кино в Москве"),strTitle.contains("Кино в Москве"));

    }

    @Step("Нажата кнопка Завтра")
    public void clickDate()
    {
        new YaAfishaFilmPage().dateWhen.click();
        new YaAfishaFilmPage().dateTomorrow.click();
    }
}
