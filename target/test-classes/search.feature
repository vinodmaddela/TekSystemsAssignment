@search
Feature:Multiple search based results

  Scenario: invalid search
    Given user opens RS Components website landing page
    When user enters invalid text and clicks search
    Then user is displayed invalid message with search text box

  Scenario: valid search
    Given user opens RSComponents website landing page
    When user enter valid text and clicks search
    Then user is navigated to the products page
    Then user is displayed with products viewing page

  Scenario: search history
    Given user opens RS Components website Homepage
    When user enters random text and clicks search
    Then user is displayed with recent searches
    Then user clicks on recent search item
