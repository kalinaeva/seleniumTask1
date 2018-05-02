package steps;
//
//import pages.SendAppPage;
//import ru.yandex.qatools.allure.annotations.Step;
//
//import java.util.HashMap;
//
//public class SendAppSteps extends BaseSteps{
//    @Step("Поле {0} Заполняем значение{1}")
//    public void stepFillField(java.lang.String field, java.lang.String value){
//        new SendAppPage(driver).fillField(field, value);
//    }
//    @Step("Заполняем поля:")
//    public void stepFillField(HashMap<java.lang.String, java.lang.String> fields){
//        fields.forEach(this::stepFillField);
//    }
//}

import pages.SendAppPage;
import ru.yandex.qatools.allure.annotations.Step;
import steps.BaseSteps;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;

public class SendAppSteps extends BaseSteps {
    @Step("Поле {0} заполняется значением {1}")
    public void stepFillField(String fieldName, String value) {
        new SendAppPage(driver).fillField(fieldName, value);
    }

    @Step("Заполняются поля:")
    public void stepFillFields(HashMap<String, String> fields) {
        fields.forEach(this::stepFillField);
    }

//    @Step("поле {0} заполнено значением {1}")
//    public void stepCheckFillField(String field, String value) {
//
//        String actual = new SendAppPage(driver).getCheckField(field);
//        assertTrue(String.format("Значение поля [%s] равно [%s]. Ожидалось - [%s]", field, actual, value),
//                actual.equals(value));
//    }

//    @Step("Поля заполнены верно:")
//    public void checkFillFields(HashMap<String, String> fields) {
//        fields.forEach((k, v) -> stepCheckFillField(k, v));
//    }
//
//
//    @Step("Выполнено нажатие на кнопку - Продолжить")
//    public void stepClickButtonNextReg() {
//        new SendAppPage(driver).nextReg.click();
//    }
}