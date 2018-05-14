package ru.yandex.test.step;

import ru.yandex.test.page.YaFilmResultPage;
import ru.yandex.qatools.allure.annotations.Step;

public class YaFilmResultStep {
    @Step("Закрыта реклама")
    public void closeRek() {

        new YaFilmResultPage().closeB.click();

    }

    @Step("Выбран фильм")
    public void getFilm8() {

        new YaFilmResultPage().maxRating().hrefFilm.click();

    }
}
