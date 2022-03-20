package lesson_10_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.time.Instant;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        // TEST 1 "Logg in"

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.ru/");
        Thread.sleep(3000);

        String originalWindow = driver.getWindowHandle();
       driver.findElement(By.xpath("//a [@class = 'ph-project svelte-jq5qv5']")).click();


        Thread.sleep(5000);

        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        driver.findElement(By.xpath("//div [@class = 'auto-0-2-80']/input")).sendKeys("testtestovich15");


        driver.findElement(By.xpath("//button [@class = 'base-0-2-87 primary-0-2-101 auto-0-2-113']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input [@class = 'input-0-2-77 withIcon-0-2-78']")).sendKeys("andersen2022");

        driver.findElement(By.xpath("//button [@class = 'base-0-2-87 primary-0-2-101 auto-0-2-113']")).click();
        Thread.sleep(5000);

        //TEST 2 "Send а letter"

        driver.findElement(By.xpath("//a [@class = 'compose-button compose-button_white compose-button_base compose-button_with-dropdown js-shortcut']")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//div [@class = 'inputContainer--nsqFu']/input")).sendKeys("testtestovich15@mail.ru");

        driver.findElement(By.xpath("//div [@class = 'container--3QXHv']/div/input")).sendKeys("Test letter");


        driver.findElement(By.tagName("br")).sendKeys("Test letter");

        driver.findElement(By.xpath("//span [@class = 'button2__txt']")).click();

        Thread.sleep(5000);

        driver.quit();

    }
}
