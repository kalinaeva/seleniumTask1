import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.module.FindException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class firsttest {


    WebDriver driver;
    String baseUrl;

    @Before
    public void BeforeTest() {
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        baseUrl = "http://www.sberbank.ru/ru/person";
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test
    public void Testset() {
        Wait<WebDriver> wait = new WebDriverWait(driver, 90, 10000);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"alt-menu-mid\"]/ul/li[5]/a")));
        By.xpath("//*[@class=\"alt-menu-mid\"]/ul/li[5]/a").findElement(driver).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class,'header_more_nav')]//*" +
                "[contains(text(), 'Страхование путешественников')]")));
        By.xpath("//div[contains(@class,'header_more_nav')]//*[contains(text(), 'Страхование путешественников')]").findElement(driver).click();
        WebElement title = driver.findElement(By.xpath("//div[contains(@class,'sbrf-rich-outer')]/h1"));
        wait.until(ExpectedConditions.visibilityOf(title));
        Assert.assertEquals("Страхование путешественников", title.getText());

        driver.findElement(By.xpath("//a//img[contains(@src,'banner-zashita-traveler')]")).click();

        for (String handle : driver.getWindowHandles()) { //Переключение экрана
            driver.switchTo().window(handle);
        }

        driver.findElement(By.xpath("//div[contains(text(),'35')]")).click();
        driver.findElement(By.xpath("//span[contains(@class,'b-button-block-center')]/span[contains(text(),'Оформить')]")).click();

        fillField(By.name("insured0_surname"), "Ivanov");
        fillField(By.name("insured0_name"), "Ivan");
        fillField(By.name("insured0_birthDate"), "01.01.1999");

        fillField(By.name("surname"), "Петров");
        fillField(By.name("name"), "Петр");
        fillField(By.name("middlename"), "Петрович");
        fillField(By.name("birthDate"), "01.01.1999");

        driver.findElement(By.name("female")).click();

//        driver.findElement(By.name("//li[contains(@class,'alt-menu-collapser_opened')]/a/span/span[contains(text(),'Застраховать себя')]")).click();
//        fillField(By.name("birthDate"), "19.05.1985");

        fillField(By.name("passport_series"), "1122");
        fillField(By.name("passport_number"), "334455");
        fillField(By.name("issueDate"), "09.06.2005");
        fillField(By.name("issuePlace"), "ОВД");

//        Assert.assertEquals("Введите адрес электронной почты", driver.findElement(By.xpath("//*[@id=\"applicationForm\"]/div[2]/div[6]/div/label/span")).getText());
        Assert.assertEquals("Ivanov", driver.findElement(By.name("insured0_surname")).getAttribute("value"));
        Assert.assertEquals("Ivan", driver.findElement(By.name("insured0_name")).getAttribute("value"));
//        Assert.assertEquals("19.05.1985", driver.findElement(By.name("insured0_birthDate")).getAttribute("value"));

        Assert.assertEquals("Петров", driver.findElement(By.name("surname")).getAttribute("value"));
        Assert.assertEquals("Петр", driver.findElement(By.name("name")).getAttribute("value"));
        Assert.assertEquals("Петрович", driver.findElement(By.name("middlename")).getAttribute("value"));
//        Assert.assertEquals("19.05.1985", driver.findElement(By.name("birthDate")).getAttribute("value"));

        Assert.assertEquals("1122", driver.findElement(By.name("passport_series")).getAttribute("value"));
        Assert.assertEquals("334455", driver.findElement(By.name("passport_number")).getAttribute("value"));
//        Assert.assertEquals("09.06.2005", driver.findElement(By.name("issueDate")).getAttribute("value"));
        Assert.assertEquals("ОВД", driver.findElement(By.name("issuePlace")).getAttribute("value"));

        driver.findElement(By.xpath("//span[@class=\"b-continue-btn\"]")).click();

//        WebElement sendBtn = driver.findElement(By.xpath("//div[contains(@class,'b-form-center-pos')]/div[contains(text(),'Заполнены не все обязательные поля')]"));
        By by = By.xpath("//div[contains(@class,'b-form-center-pos')]/div[contains(text(),'Заполнены не все обязательные поля')]");
//        Assert.assertEquals(true, isElementPresent(by));
    }

    public void fillField(By locator, String value) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(value);
    }

    @After
    public void afterTest() {
        driver.quit();
    }

}
