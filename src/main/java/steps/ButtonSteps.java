package steps;

import pages.StraxPage;
import ru.yandex.qatools.allure.annotations.Step;

import static steps.BaseSteps.driver;

public class ButtonSteps extends BaseSteps{

    @Step("Нажата кнопка - Оформить")
    public void stepClickButton() {
        new StraxPage(driver).batton.click();
    }
}
