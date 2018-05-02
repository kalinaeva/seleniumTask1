package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StraxPage {
    @FindBy(xpath = "//div[contains(@class,'header_more_nav')]//*[contains(text(), 'Страхование путешественников')]")
    public WebElement list;
    @FindBy(xpath = "//a//img [contains(@src,'banner-zashita-traveler')]")
    public WebElement sendButtom;


    @FindBy(xpath = "//span [contains(text(),'Оформить')]")
    public WebElement batton;
    public StraxPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        Wait<WebDriver> wait = new WebDriverWait(driver,10, 1000);
//        wait.until(ExpectedConditions.visibilityOf(list)).click();
//        wait.until(ExpectedConditions.visibilityOf(sendButtom)).click();
//

//        for (String handle : driver.getWindowHandles()) { //Переключение экрана
//            driver.switchTo().window(handle);
//        }

//        wait.until(ExpectedConditions.visibilityOf(batton)).click();
    }

    public void selectIssueButton(){
        batton.click();
    }
}
