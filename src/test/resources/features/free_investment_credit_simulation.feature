Feature: Free investment credit simulation
  As a person
  I want to similate a free investment credit
  So that I can see the different option and I can choose the best

  Scenario: Simulate the free investment loan
    Given I am in the Bancolombia Personas online page
    When I enter the credits section
    And I choose the simulate free investment credit option
    And I enter all the requested information
    Then I can see the different options for the free investment credit
