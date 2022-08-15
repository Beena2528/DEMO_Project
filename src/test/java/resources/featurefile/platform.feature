Feature: Crypto currency check in to favorites
  As user, I want to check  https://myvip.avatrade.com/?wtrelogin=1 website


  Scenario: User should able be to add selected crypto currency in favorites
    Given I am on homePage
    When I click on try free demo button
    And  I enter first name "hfgfgj"
    And I enter last name "Marsmdkm"
    And I enter email id
    And I enter phone number "8563215395"
    And I click on both check box
    And I click on create account
    And I click on skip tutorial pop-up
    And I click on close button pop-up
    And I Select Trade tab on left side
    And I Scroll down for categories list and select crypto
    And I Select five random cryptocurrencies and click the star icon
    And I Select the favourites button
    Then I verify all the options are available in favourites













