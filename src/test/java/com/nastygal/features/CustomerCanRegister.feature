Feature: Register for a new account
  As a Customer
  I want the ability to register on web or when i download the app


  Scenario Outline: Customer can register
    Given I navigate to nastygal homepage
    When I click on My Account
    And I click on CREATE ACCOUNT button
    And I enter "<FirstName>" in the first name field
    And I enter "<LastName>" in the last name field
    And I enter "<BirthDay>" in the birth day field
    And I enter "<BirthMonth>" in the birth month field
    And I enter "<BirthYear>" in the birth year field
    And I select "<Gender>" from the gender drop down
    And I enter "<EmailAddress>" in the email address field
    And I enter "<EmailAddress>" in the confirm email address field
    And I enter "<Password>" in the password field
    And I enter "<Password>" in the confirm password field
    And I click on REGISTER button
    Then I am taken to nastygal homepage


    Examples:
      |FirstName|LastName|BirthDay|BirthMonth|BirthYear|Gender|EmailAddress        |Password|
      |Joss     |Ola    | 13       |04       |1980     |Male  |Auuto@mailinator.com|Boohoo123|
     ##|Joss   |Ola    |  13       |04       |1980     |Male  |Auuto@mailinator.com |Boohoo123|


    @ignore
  Scenario Outline: Customer cannot register with missing field
    Given I navigate to nastygal homepage
    When I click on the image icon and select register to display the register form
    And I enter "<Title>" in the tittle field
    And I enter "<FirstName>" in the first name field
    And I enter "<LastName>" in the last name field
    And I enter "<DateOfBirth>" in the date of birth field
    And I select "<Gender>" from the gender dropdown
    And I enter "<EmailAddress>" in the email address field
    And I enter "<EmailAddress>" in the confirm email address field
    And I enter "<Password>" in the password field
    And I enter "<Password>" in the confirm password field
    And I click on "<Register>"
    Then I get an error message or a prompt for the missing field

    Examples:
      |Title| FirstName|LastName|DateOfBirth|Gender|EmailAddress        |Password|
      |Mr     |Joss      |Ola     |13/04/1980 |M     |           | Boohoo123|


