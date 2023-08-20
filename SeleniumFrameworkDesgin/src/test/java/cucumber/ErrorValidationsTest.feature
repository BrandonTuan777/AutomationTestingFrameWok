#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step

@tag
Feature: Error validation
  I want to use this template for my feature file

  @ErrorValidations
  Scenario Outline: Title of your scenario outline
    Given I landed on LoginPage
    Given Logged in with user phone number <phone> and password <password>
    Then <error_message> message is display

       Examples: 
      | phone  		 | password     |error_message																									|
      | 0888700954 |Tuanlaiduy12* |Số điện thoại hoặc mật khẩu chưa đúng, vui lòng kiểm tra lại.|
     
