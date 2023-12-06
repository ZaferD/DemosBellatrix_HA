package stepdefs;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseSteps {

   WebDriverWait wait;
   WebDriver driver;


   public BaseSteps(){

      driver = Driver.getDriver();
      wait = new WebDriverWait(driver,Duration.ofSeconds(10));
   }




   public void click(By locator){




   }




}