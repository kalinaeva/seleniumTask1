package steps;

import pages.SendAppPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;

public class SendAppSteps extends BaseSteps{
    @Step("Поле {0} Хаполняем значение{1}")
    public void stepFillField(java.lang.String field, java.lang.String value){
        new SendAppPage(driver).fillField(field, value);
    }
    @Step("Заполняем поля:")
    public void stepFillField(HashMap<java.lang.String, java.lang.String> fields){
        fields.forEach(this::stepFillField);
    }
}
