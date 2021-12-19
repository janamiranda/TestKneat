@Test4
Feature: 2.	Feature assure Starbucks is displayed

  Scenario: At Result Page: Assert that “STARBUCKS® Limerick - Thomas Street” is displayed.
    Given user is on Just Eat home page
    When it goes to Just Eat result page
    Then system shall display STARBUCKS Limerick - Thomas Street