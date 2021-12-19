@Test2
Feature: 2.	Feature to test search Limerick and a header result

  Scenario: At Home Page: Search works when searched for Limerick. Assert that the results page’s header displays Limerick Strand Hotel.
    Given Just Eat home page is open again
    When user search for Limerick
    Then system shall display the header Limerick Strand Hotel