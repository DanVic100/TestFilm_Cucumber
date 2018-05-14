package ru.yandex.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class YaAfishaPage extends BasePage{

    @FindBy(xpath = "//a[contains(text(),'Кино')]")
    public WebElement menuFilm;



    public void clickMenuFilm()
    {
        menuFilm.click();
    }


}
