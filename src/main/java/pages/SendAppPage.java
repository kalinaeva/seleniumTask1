package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendAppPage {
    @FindBy(xpath = "//span [contains(text(),'Оформление')]" )
    public WebElement zayavka;
    @FindBy(xpath = "//*[@id=\"views\"]/section/form/section/section[1]/div/insured-input/div/fieldset[2]/div/input")
    public WebElement insured0surname;
    @FindBy(xpath = "//*[@id=\"views\"]/section/form/section/section[1]/div/insured-input/div/fieldset[3]/div/input")
    public WebElement insured0name;
    @FindBy(name = "insured0_birthDate")
    public WebElement insured0birthdate;
//    @FindBy(name = "surname")
    @FindBy(xpath = "//*[@id=\"views\"]/section/form/section/section[2]/div/fieldset[3]/div/input")
    public WebElement surname;
    @FindBy(name = "name")
    public WebElement name;
    @FindBy(name = "middlename")
    public WebElement middlename;
    @FindBy(name = "birthDate")
    public WebElement birthDate;
    @FindBy(name = "female")
    public WebElement female;
    @FindBy(name = "passport_series")
    public WebElement passportseries;
    @FindBy(name = "passport_number")
    public WebElement passportnumber;
    @FindBy(name = "issueDate")
    public WebElement issuedate;
    @FindBy(name = "issuePlace")
    public WebElement issueplace;

    @FindBy(xpath = "//span [contains(text(),'Продолжить')]" )
    public WebElement sendButtom;

    @FindBy(xpath = "//div [text()='Заполнены не все обязательные поля']" )
    public WebElement alertText;

    public SendAppPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        Wait<WebDriver> wait = new WebDriverWait(driver,10, 1000);
    }

    public void fillField(String fieldName, String value){
        switch (fieldName){
            case "ФамилияСтрахуемого": fullFillRefactor(insured0surname, value);
                break;
            case "ИмяСтрахуемого": fullFillRefactor(insured0name, value);
                break;
            case "ДатаРожденияСтрахуемого":
                fullFillRefactor(insured0birthdate, value);
                break;
            case "Фамилия": fullFillRefactor(surname, value);
                break;
            case "Имя": fullFillRefactor(name, value);
                break;
            case "Отчество": fullFillRefactor(middlename, value);
                break;
            case "ДатаРождения": fullFillRefactor(birthDate, value);
                break;
            case "Пол": fullFillRefactor(female, value);
                break;
            case "ПаспортСерия": fullFillRefactor(passportseries, value);
                break;
            case "ПаспортНомер": fullFillRefactor(passportnumber, value);
                break;
            case "ПаспортДатаВыдачи": fullFillRefactor(issuedate, value);
                break;
            case "ПаспортГдеВыдан": fullFillRefactor(issueplace, value);
                break;
            default: throw new AssertionError("Поле '" + fieldName + "' не объявлено на странице");
        }
    }


    protected void fullFillRefactor(WebElement element, String value)
    {
        element.clear();
        element.sendKeys(value);
    }
}