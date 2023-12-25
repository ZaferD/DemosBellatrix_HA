package stepdefs;


import io.cucumber.java.en.Given;

import static stepdefs.Locator.*;

public class CartStepdefsTest extends BaseSteps {

    @Given("user on homepages")
    public void userOnHomepages() {
        driver.navigate().to(url);
    }
}