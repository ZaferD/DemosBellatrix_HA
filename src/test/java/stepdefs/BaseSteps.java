package stepdefs;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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


    public void click(WebElement element) {
        element.click();

    }


    public WebElement addToCart(String s) {

        // By lAddToCarts = By.xpath("//a[text()='Add to cart']['"+ +"']"); bu locator -Locator Enum- classindan alinmistir
        // String addedToCart = "//li//*[contains(text(),'%s')]"; bu String -Locator Enum- classindan alinmistir

        List<WebElement> elements = driver.findElements(lAddToCarts);
        String str = wantedStr;
        By locator = By.xpath(String.format(str, s));

        WebElement element = null;
        int counter = 0;

        String addCrt = "(//*[text()='Add to cart'])['" + counter + "']";

        for (int i = 0; i < elements.size(); i++) {

            if (driver.findElement(locator).getText().contains(s)) {
                By loc = By.xpath(String.format(addCrt, counter));
                element = wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
                break;
            } else counter++;

        }


        return element;
    }

}