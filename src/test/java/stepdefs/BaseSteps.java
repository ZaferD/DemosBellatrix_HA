package stepdefs;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static stepdefs.Locator.*;

import java.time.Duration;

public class BaseSteps {

    WebDriverWait wait;
    WebDriver driver;


    public BaseSteps() {

        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public void click(By locator) {


    }


    public WebElement addToCart(String s) {

       // By lAddToCart = By.xpath("//a[text()='Add to cart']"); bu locator -Locator Enum- classindan alinmistir
       // String addedToCart = "//li//*[contains(text(),'%s')]"; bu String -Locator Enum- classindan alinmistir

        String str = addedToCart;
        By locator = By.xpath(String.format(str, s));
        WebElement element = null;

        if (driver.findElement(locator).getText().contains(s)) {
            element = driver.findElement(lAddToCart);
        }
        return element;
    }

}