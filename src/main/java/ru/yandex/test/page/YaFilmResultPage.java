package ru.yandex.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.test.util.Film;


import java.util.List;

public class YaFilmResultPage extends BasePage {

    private WebDriverWait wait;

    public WebElement hrefFilm;

    //колличество театров
    @FindBy(xpath = " //div[@class='event__inner']//span")
    private List<WebElement> numberTeatre;

    //ссылки фильмов
    @FindBy(xpath = "//h2/../../a")
    private List<WebElement> hrefFilms;

    //заголовки фильмов
    @FindBy(xpath = "//h2")
    private List<WebElement> listFilm;

    //рэйтинкги
    @FindBy(xpath = "//a[@itemprop='url']//div[@itemprop='ratingValue']")
    private List<WebElement> rating;

    //закрыть рекламу
    @FindBy(xpath = "//div[@class='tutorial-modal__close']")
    public WebElement closeB;



    private void NameFilm(String name)
    {
        Film.setName(name);
    }

    private void NumTeathr(String t)
    {
        Film.setTeathre(t);
    }
    //уточнить, выдает не тот фильм
    public YaFilmResultPage maxRating()
    {

        int i = 0;
        int maxI = 0;

        for (WebElement r:rating)
        {
            double rat = Double.parseDouble(r.getText());

            if (rat>=8)
            {
                maxI=i;
            }
            i++;
        }
        hrefFilm = hrefFilms.get(maxI);
        NumTeathr(numberTeatre.get(maxI).getText());
        NameFilm(listFilm.get(maxI).getText());
        return this;
    }

}
