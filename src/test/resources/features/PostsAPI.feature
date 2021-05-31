@SampleTest
Feature: To validate posts API
  
  Scenario Outline: To verify postAPI by providing valid Post Id
    Given Set Posts URL for <postId>
    When Post the request
    Then Status code should be 200
    And <postId> should be displayed in response

    Examples: 
      | postId  |
   	|1|
   	|50|
   	
   	 Scenario Outline: To verify postAPI by providing invalid Post Id
    Given Set Posts URL for <postId>
    When Post the request
    Then Status code should be 404

    Examples: 
      | postId  |
   	|101|
