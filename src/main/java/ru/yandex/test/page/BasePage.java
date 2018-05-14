package ru.yandex.test.page;

import org.openqa.selenium.support.PageFactory;
import ru.yandex.test.step.BaseStep;

public class BasePage {


    public BasePage() {

        PageFactory.initElements(BaseStep.getDriver(),this);
    }


}
