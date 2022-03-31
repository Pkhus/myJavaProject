package lesson_14;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest {
    public static LoginPage loginPage;
    public static ProfilePage profilePage;
    public static WebDriver driver;

    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromdriver"));

        driver = new ChromeDriver();

        loginPage = new LoginPage(driver);

        profilePage = new ProfilePage(driver);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(ConfProperties.getProperty("loginpage"));
    }

    @Test
    public void LoginTest() {
        loginPage.inputLogin(ConfProperties.getProperty("login"));

        loginPage.clickPassBtn();

        loginPage.inputPass(ConfProperties.getProperty("password"));

        loginPage.clickLoginBtn();

        String user = profilePage.getUserName();

        assertEquals(ConfProperties.getProperty("adress"), user);
    }

    @Test
    public void LetterTest() {
        loginPage.inputLogin(ConfProperties.getProperty("login"));

        loginPage.clickPassBtn();

        loginPage.inputPass(ConfProperties.getProperty("password"));

        loginPage.clickLoginBtn();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a [@class = 'compose-button compose-button_white compose-button_base compose-button_with-dropdown js-shortcut']")));

        profilePage.clickLetterBtn();

        profilePage.inputAdress(ConfProperties.getProperty("adress"));

        profilePage.inputTheme(ConfProperties.getProperty("theme"));

        profilePage.inputText(ConfProperties.getProperty("textLetter"));

        profilePage.clickSendBtn();

        String conf = profilePage.getConf();

        assertEquals("Письмо отправлено", conf);


    }


    @AfterAll

    public static void QuitBrow() {

        driver.quit();
    }

}
