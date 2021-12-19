@Test1
Feature: 1.	Feature to test empty search box and message after clicking enter

  Scenario: Cannot search for restaurants if none text is entered in the search box. Message with “Please enter a location” should be displayed.
    Given Just Eat home page is open
    When user hits enter with empty search box
    Then system shaw display Please enter a location