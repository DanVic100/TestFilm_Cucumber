package ru.yandex.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YaMainPage extends BasePage {

    @FindBy(xpath = "//a[@data-statlog='afisha.title.link']")
    public WebElement afisha;

}
