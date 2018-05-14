package ru.yandex.test.step;

import ru.yandex.test.page.YaAfishaPage;
import ru.yandex.qatools.allure.annotations.Step;

public class YaAfishaStep {

    @Step("Нажатие на кнопку Кино")
    public void clickMenuFilm()
    {
        new YaAfishaPage().clickMenuFilm();
    }
}
