Feature: Add products to cart

  @Successful
  Scenario: Successfully add two products to the shopping cart
    Given that the user opens the browser and searches for a product through the search bar.
    When the user can select two products randomly with different quantities and add them to the cart.
    Then the user should be able to view the products in the shopping cart.