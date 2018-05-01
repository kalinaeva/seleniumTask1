import org.junit.Test;
import pages.MainPage;
import pages.SendAppPage;
import pages.StraxPage;
import steps.BaseSteps;


public class MyRefTest extends BaseSteps {

    @Test
    public void newFirstTest(){
        driver.get(baseUrl);
        MainPage mainPage = new MainPage(driver);
        mainPage.selectMainMenu("Страхование");
        mainPage.selectSubMenu("Путешествиники");
        new StraxPage(driver).list.click();
        new StraxPage(driver).sendButtom.click();
        new StraxPage(driver).promo.click();
        new StraxPage(driver).straxSum.click();
        new StraxPage(driver).batton.click();



        SendAppPage sendAppPage = new SendAppPage(driver);
        sendAppPage.fillField("Фамилия", "Иванов");
        sendAppPage.fillField("Имя", "Иван");
      }

}
