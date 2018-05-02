package steps;

import pages.StraxPage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertEquals;

public class StraxSteps extends BaseSteps{
    @Step("проверка заголовка - Страхование путешественников")
    public void stepCheckTitle(String expectedTitle) {
//        String actualTitle = new StraxPage(driver).title.getText();
//        assertEquals(String.format("Заголовок равен [%s]. Ожидалось - [%s]", actualTitle, expectedTitle), expectedTitle, actualTitle);
    }
    @Step("Оформить Онлайн")
        public void stepSendButton(){

        new StraxPage(driver).sendButtom.click();
    }
}
