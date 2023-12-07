package stepdefs;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static stepdefs.Locator.*;

import java.time.Duration;
import java.util.List;

public class BaseSteps {

    WebDriverWait wait;
    WebDriver driver;


    public BaseSteps() {

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public void click(By locator) {

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        click(element);

    }

    public void click(WebElement element) {

        wait.until(ExpectedConditions.visibilityOf(element)).click();

    }

    public void sleep(int num) {

        try {
            Thread.sleep(num*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void sendKeys(By locator, CharSequence...texts){

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        sendKeys(element, texts);

    }

    public void sendKeys(WebElement element, CharSequence...texts){

        element.clear();
        element.sendKeys(texts);

    }

    public void sendKeysEnter(By locator, CharSequence...texts){

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        sendKeys(element, texts);
        new Actions(driver).keyDown(Keys.ENTER).perform();
    }

    public void visibilityOfLocator(By locator){

       wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

}