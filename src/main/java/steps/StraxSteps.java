package steps;

import pages.StraxPage;
import ru.yandex.qatools.allure.annotations.Step;

public class StraxSteps extends BaseSteps{
    @Step("Кнопка оформить")
    public void stepSendAppButton(){
        new StraxPage(driver).sendButtom.click();
    }
}
