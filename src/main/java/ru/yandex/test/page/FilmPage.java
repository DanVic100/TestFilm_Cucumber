package ru.yandex.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilmPage extends BasePage {

    //количество кинотеатров
    @FindBy(xpath = "//span[@class='event-heading__place']")
    public WebElement numT;

    @FindBy(xpath = "//h1[@class='event-heading__title']")
    public WebElement name;

}
