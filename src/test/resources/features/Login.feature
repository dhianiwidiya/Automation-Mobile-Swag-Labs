@login
  Feature: Login

    Scenario: Login
      Given User input username and password
      And User click Login
      And User verify $29.99
      And User click Add to Cart
      And User click Cart
      And User verify in Cart