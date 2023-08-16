
@tag
Feature: Create a news post from website rongbay.com
  I want to use this template for my feature file
  
  Background:
	Given I landed on LoginPage

  @CreateNews
  Scenario Outline: Positive Test of Create a new post
    Given Logged in with user phone number <phone> and password <password>
    When I click the button creat news
    And  Create a news post by filling in the fields that need information and submit
    Then The title of the new post display  

    Examples: 
      | phone  		 | password    |
      | 0888700954 |Tuanlaiduy1* |
     
