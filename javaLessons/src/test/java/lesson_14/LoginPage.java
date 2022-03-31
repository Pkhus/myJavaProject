package lesson_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(xpath = "//div [@class = 'auto-0-2-80']/input")
    private WebElement loginField;

    @FindBy(xpath = "//button [@class = 'base-0-2-87 primary-0-2-101 auto-0-2-113']")
    private WebElement passBtn;

    @FindBy(xpath = "//input [@class = 'input-0-2-77 withIcon-0-2-78']")
    private WebElement passwordField;

    @FindBy(xpath = "//button [@class = 'base-0-2-87 primary-0-2-101 auto-0-2-113']")
    private WebElement loginBtn;


    public void inputLogin(String login) {
        loginField.clear();
        loginField.sendKeys(login);
    }

    public void clickPassBtn() {
        passBtn.click();
    }

    public void inputPass(String pass) {
        passwordField.clear();
        passwordField.sendKeys(pass);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }
}
