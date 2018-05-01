import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;
import steps.BaseSteps;
import steps.MainSteps;
import steps.SendAppSteps;
import steps.StraxSteps;

import java.util.HashMap;

public class MyTestForAllure extends BaseSteps {

    @Test
    @Title("Страхование")
    public void textInsurance(){
        MainSteps mainSteps = new MainSteps();
        StraxSteps straxSteps = new StraxSteps();
        SendAppSteps sendAppSteps = new SendAppSteps();

        HashMap<String, String> testData = new HashMap<>();
        testData.put("Фамилия", "Иванов");
        testData.put("Имя", "Иван");

        mainSteps.stepSelectMainMenu("Страхование");
        mainSteps.stepSelectSubMenu("Путешествиники");

        straxSteps.stepSendAppButton();

        sendAppSteps.stepFillField(testData);
    }
}
