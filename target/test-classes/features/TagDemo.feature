# this mean if this tag is called, all the scenario will run
# after the tag, we dont write anything

@all  
Feature: Testing on NinaDemo applications

Background:
Given I am on tutorialsNinja Homepages

@login @smoke
 Scenario Outline: Test username and password for Login Pages
    Then I click on my rediff account link
    When I click on login  links
    Then I will be on the login pagesand I capture the title of the page
    And I enter email id as '<EmailId>' on the pages
    And I enter password as '<password>' on the pages
    Then I click login buttons
  	And I close browser
    Examples: 
      | EmailIds               | passwords |
      | seleniumdemo@gmail.com |   123456 |

@search @regression
Scenario:
Then I enter Input for the search box
And I click on search button
And I close browser

@AddtoCart @regression
Scenario:

And I click on Add to Cart button
And I close browser

@checkout @regression
Scenario:

And I click on Checkout button
And I close browser

@logout @smoke
Scenario:

Then I click on my account links
And I click on logout link
And I close browser