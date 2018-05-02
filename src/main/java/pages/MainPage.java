package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(xpath="//*[@id=\"main\"]/div/div/table/tbody/tr/td/div/div/div/div/div/div[1]/div[1]/div[4]/div")
    WebElement mainMenu;

    @FindBy(xpath="//*[@id=\"main\"]/div/div/table/tbody/tr/td/div/div/div/div/div/div[1]/div[1]/div[4]/div/div/div/ul/li[5]/a")
    WebElement subMenu;

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        //this.driver = driver;
    }
    public void selectMainMenu(String menuItem){
        mainMenu.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr/td/div/div/div/div/div/div[1]/div[1]/div[4]/div")).click();
    }

    public void selectSubMenu(String menuItem){
        subMenu.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr/td/div/div/div/div/div/div[1]/div[1]/div[4]/div/div/div/ul/li[5]/a")).click();
    }

}
