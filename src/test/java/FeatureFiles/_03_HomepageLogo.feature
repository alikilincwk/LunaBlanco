
Feature: Homepage Logo Navigation
  As a user,
  I want to navigate to the homepage by clicking the company logo,
  So that I can easily return to the main page.

  Scenario: Click on the company logo redirects to homepage
    Given I am on the LunaBlanco website
    When I click on the company logo
    Then I should be redirected to the homepage
