package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static stepdefs.Locator.*;

public class CartStepdefs extends BaseSteps{
    @Given("user on homepage")
    public void userOnHomepage() {
        driver.navigate().to(url);

    }

    @When("user add the product {string} to the cart")
    public void userAddTheProductToTheCart(String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(lSearch));
        element.sendKeys(text);
        new Actions(driver).keyDown(Keys.ENTER).perform();
        click(addToCart(text));

    }

    @And("user click to Cart")
    public void userClickToCart() {

    }

    @Then("the product {string} should be in Cart")
    public void theProductShouldBeInCart(String arg0) {
    }
}