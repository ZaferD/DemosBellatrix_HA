Feature: Add to Cart

  Scenario: Add to Cart
    Given user on homepage
    When  user add the product "Falcon Heavy" to the cart
    And   user click to Cart
    Then  the product "Falcon 9" should be in Cart