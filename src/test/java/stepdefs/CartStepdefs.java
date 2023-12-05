package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartStepdefs {
    @Given("user on homepage")
    public void userOnHomepage() {


    }

    @When("user add the product {string} to the cart")
    public void userAddTheProductToTheCart(String arg0) {
    }

    @And("user click to Cart")
    public void userClickToCart() {
    }

    @Then("the product {string} should be in Cart")
    public void theProductShouldBeInCart(String arg0) {
    }
}