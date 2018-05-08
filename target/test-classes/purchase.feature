@purchase
Feature: User purchases from RS Components website

  Scenario: user should be able to purchase the item
    Given user is on RS Components website landing page
    Then user clicks on brands menu tab
    Then user clicks on All Brands
    Then user clicks on Letter S and selects siemens brand
    Then user should be directed to the siemens products page
    Then user clicks on the product and clicks buy
    Then user clicks on add to basket
    Then user clicks on view basket
    And clicks on checkout button for purchase

  Scenario: user places a quick order
    Given user is on RS Componets website landing page
    Then user enters RS Stock number and selects quantity
    Then user clicks on Add to Basket
    Then user is naviagated to the checkout page
    Then user is displayed product availability
    Then user should be displayed with updated results