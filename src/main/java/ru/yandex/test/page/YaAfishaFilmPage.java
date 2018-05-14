package ru.yandex.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YaAfishaFilmPage extends BasePage {

    @FindBy(xpath = "//h1")
    public WebElement titleFilmMoscow;

    @FindBy(xpath = "//span[contains(text(),'Когда')]/..")
    public WebElement dateWhen;

    @FindBy(xpath = "//span[contains(text(),'Завтра')]")
    public WebElement dateTomorrow;


    @FindBy(xpath = "//span[contains(text(),'Закрыть')]/..")
    public WebElement closeB;








}
