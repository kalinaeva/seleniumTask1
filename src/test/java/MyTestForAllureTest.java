//import org.junit.Ignore;
//import org.junit.Test;
//import ru.yandex.qatools.allure.annotations.Title;
//import steps.BaseSteps;
//import steps.MainSteps;
//import steps.SendAppSteps;
//import steps.StraxSteps;
//
//
//import java.util.HashMap;
//
//public class MyTestForAllureTest extends BaseSteps {
//
//    @Test
//    @Title("Страхование")
//    public void textInsuranceTest(){
//        MainSteps mainSteps = new MainSteps();
//        StraxSteps straxSteps = new StraxSteps();
//        SendAppSteps sendAppSteps = new SendAppSteps();
//
//        HashMap<String, String> testData = new HashMap<>();
//        testData.put("Фамилия", "Иванов");
//        testData.put("Имя", "Иван");
//
//        mainSteps.stepSelectMainMenu("Страхование");
//        mainSteps.stepSelectSubMenu("Путешествиники");
//
//        straxSteps.stepSendAppButton();
//
//        for (String winHandle : driver.getWindowHandles()) {
//            driver.switchTo().window(winHandle);
//        }
//
//        sendAppSteps.stepFillField(testData);
//
//    }
//}

import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;
import steps.*;

import java.util.HashMap;

public class MyTestForAllureTest extends BaseSteps {
    //убрала MainSteps mainSteps = new MainSteps();
    HashMap<String, String> testData = new HashMap<>();

    @Test
    @Title("Оформление страхования")
    public void Test() {
        MainSteps mainSteps = new MainSteps();
        StraxSteps straxSteps = new StraxSteps();
        ButtonSteps buttonSteps = new ButtonSteps();
        SendAppSteps sendAppSteps = new SendAppSteps();
        //убрала   HashMap<String, String> testData = new HashMap<>();

        mainSteps.stepSelectMainMenu("Застраховать");
        mainSteps.stepSelectSubMenu("Путешествиники");

        straxSteps.stepCheckTitle("Страхование путешественников");
        straxSteps.stepSendButton();

        testData.put("Фамилия застрахованного", "Иванов");
        testData.put("Имя застрахованного", "Иван");
        testData.put("Дата рождения застрахованного", "01.01.1999");
        testData.put("Фамилия страхователя", "Иванов");
        testData.put("Имя страхователя", "Иван");
        testData.put("Отчество страхователя", "Иванович");
        testData.put("Дата рождения страхователя", "01.01.1999");
        testData.put("Пол страхователя", "");
        testData.put("Серия паспорта", "1122");
        testData.put("Номер паспорта", "111222");
        testData.put("Дата выдачи паспорта", "01.01.2010");
        testData.put("Кем выдан", "ОФМС России");
//
//        for (String winHandle : driver.getWindowHandles()) {
//            driver.switchTo().window(winHandle);
//        }

        buttonSteps.stepClickButton();

        sendAppSteps.stepFillFields(testData);
//            testData.put("Дата выдачи паспорта", "12.05.2010");
//        sendAppSteps.checkFillFields(testData);
//        sendAppSteps.stepClickButtonNextReg();
//        sendAppSteps.stepCheckMassegeError("Заполнены не все обязательные поля");
    }
}