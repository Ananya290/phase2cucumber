Feature: Enter the login credentail on amazon page

  Scenario: Test username and password to the login page
    Given I am on amazon home page
    When I click the url
    Then I click one login link
    Then enter the credentail "ananya123@gmail.com" in username
    Then enter the credential "shukla123" in password
    Then click on login button
    
    
Scenario: Test to add to cart
Given I am on another page
When i click on search button
Then write mobile on search 
Then click on search button
Then click on one mobile
Then add to card
Then close the window