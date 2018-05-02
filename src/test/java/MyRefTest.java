import org.junit.Ignore;
import org.junit.Test;
import pages.MainPage;
import pages.SendAppPage;
import pages.StraxPage;
import steps.BaseSteps;


public class MyRefTest extends BaseSteps {

    @Test
//    @Ignore
    public void newFirstTest() {
        driver.get(baseUrl);
        MainPage mainPage = new MainPage(driver);
        mainPage.selectMainMenu("Страхование");
        mainPage.selectSubMenu("Путешествиники");
        new StraxPage(driver);

        SendAppPage fullFillPage = new SendAppPage(driver);
        fullFillPage.fillField("ФамилияСтрахуемого", "Иванов");
        fullFillPage.fillField("ИмяСтрахуемого", "Илья");

    }
}
