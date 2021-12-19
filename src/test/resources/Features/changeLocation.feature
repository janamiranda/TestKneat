@Test3
Feature: Feature to test user redirect

  Scenario: At result page: User is redirected to home page after clicked on “change location” link.
    Given Just Eat result page is open
    When selecting change location button
    Then page is closed
