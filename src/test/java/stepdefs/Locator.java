package stepdefs;

import org.openqa.selenium.By;

public interface Locator {

    String url = "https://demos.bellatrix.solutions/";
    By lSearch = By.xpath("//input[@id='woocommerce-product-search-field-0']");
    By lF9AddToCart = By.xpath("//a[@aria-label='Add “Falcon 9” to your cart']");
    By lViewCart = By.xpath("//a[@title='View cart']");
    By lAssertF9 = By.xpath("//a[text()='Falcon 9']");




}
