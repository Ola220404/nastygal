Feature: Customer can login into existing account
         As a customer i want to be able to login into existing account

  @login
  Scenario Outline: Customer can login
    Given I navigate to nastygal homepage
    When I click on My Account
    And I enter "<EmailAddress>" in log in email address field
    And I enter "<Password>" in log in password field
    When I click on LOG IN SECURELY button
    Then I am taken to nastygal welcomepage

    Examples:
    |EmailAddress          | Password |
    |jstmine@mailinator.com | boohoo123|