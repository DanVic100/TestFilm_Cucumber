package ru.yandex.test.step;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoSteps {

    YaMainStep yaMainStep = new YaMainStep();
    YaAfishaStep yaAfishaStep = new YaAfishaStep();
    YaAfishaFilmStep yaAfishaFilmStep = new YaAfishaFilmStep();
    YaFilmResultStep yaFilmResultStep = new YaFilmResultStep();
    FilmStep filmStep = new FilmStep();

    @When("выполнено нажатие на Афиша в Москве")
    public void click_Label()
    {
        yaMainStep.clickLebel();
    }

    @When("^нажатие на кнопку Кино$")
    public void click_menu_film()
    {
        yaAfishaStep.clickMenuFilm();
    }

    @When("^нажата кнопка закрытия рекламы$")
    public void click_reklama()
    {
        yaAfishaFilmStep.clickReklama();
    }

    @Then("^заголовок страницы  равен$")
    public void assert_title()
    {
        yaAfishaFilmStep.aasertTitle();
    }

    @When("^нажата кнопка Завтра$")
    public void click_date()
    {
        yaAfishaFilmStep.clickDate();
    }

    @When("^закрыта реклама$")
    public void close_reklama()
    {
        yaFilmResultStep.closeRek();
    }

    @When("^выбран фильм$")
    public void get_film()
    {
        yaFilmResultStep.getFilm8();
    }

    @Then("^проверка имени и кинотеатров$")
    public void assert_title2()
    {
        filmStep.assertT();
    }
}
