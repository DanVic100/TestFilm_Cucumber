package ru.yandex.test.step;

import org.junit.Assert;
import ru.yandex.test.page.FilmPage;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.test.util.Film;

import java.util.concurrent.TimeUnit;

import static ru.yandex.test.step.BaseStep.webDriver;

public class FilmStep {

    @Step("проверка имени и кинотеатров")
    public void assertT()
    {
      webDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        String strTitle = new FilmPage().name.getText();
        String strTitleOld = Film.getName();
        Assert.assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                strTitleOld, strTitle),strTitle.contains(strTitleOld));

        String srtTeath = new FilmPage().numT.getText();
        String srtTeathOld = Film.getTeathre();
        Assert.assertTrue(String.format("Фильм  [%s]. Ожидалось - [%s]",
                srtTeathOld, srtTeath),srtTeath.contains(srtTeathOld));

    }
}
