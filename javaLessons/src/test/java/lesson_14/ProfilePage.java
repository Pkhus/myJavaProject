package lesson_14;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {
    public WebDriver driver;

    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a [@class = 'compose-button compose-button_white compose-button_base compose-button_with-dropdown js-shortcut']")
    private WebElement letterBtn;

    @FindBy(xpath = "//div [@class = 'inputContainer--nsqFu']/input")
    private WebElement adressField;

    @FindBy(xpath = "//div [@class = 'container--3QXHv']/div/input")
    private WebElement themeField;

    @FindBy(tagName = "br")
    private WebElement letterField;

    @FindBy(xpath = "//span [@class = 'button2__txt']")
    private WebElement sendBtn;


    @FindBy(xpath = "//span [@class = 'ph-project__user-name svelte-1hiqrvn']")
    private WebElement userMenu;

    @FindBy(xpath = "//a [@class = 'layer__link']")
    private WebElement sendConf;

    public String getConf(){
        WebDriverWait wait = new WebDriverWait(driver,2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a [@class = 'layer__link']")));
        String conf = sendConf.getText();
        return conf;
    }


    public String getUserName(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span [@class = 'ph-project__user-name svelte-1hiqrvn']")));
        String userName = userMenu.getText();
        return userName;
    }

    public void clickLetterBtn() {
        letterBtn.click();
    }

    public void inputAdress(String adress) {
        adressField.sendKeys(adress);
    }

    public void inputTheme(String theme) {
        themeField.sendKeys(theme);
    }

    public void inputText(String text) {
        letterField.sendKeys(text);
    }

    public void clickSendBtn() {
        sendBtn.click();
    }


}
