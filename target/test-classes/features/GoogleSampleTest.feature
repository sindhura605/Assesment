@SampleTest
Feature: To validate google Search
  
  Scenario Outline: To verify google search
    Given User is in google search page
    When User provided "<SearchKeyword>"
    Then Tilte of the page should contains "<SearchKeyword>"
    And Close the browser

    Examples: 
      | SearchKeyword  |
      |Ducks|