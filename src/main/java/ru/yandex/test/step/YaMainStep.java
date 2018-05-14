package ru.yandex.test.step;

import ru.yandex.test.page.YaMainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class YaMainStep {

    @Step("выполнено нажатие на Афиша в Москве")
    public void clickLebel(){

        new YaMainPage().afisha.click();

    }
}
