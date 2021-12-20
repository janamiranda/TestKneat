# TestKneat

Automation code challenge

## Scenarios:

At Home Page: Cannot search for restaurants if none text is entered in the search box. Message with “Please enter a location” should be displayed.

At Home Page: Search works when searched for “Limerick”. Assert that the results page’s header displays “Limerick Strand Hotel”.

At Results Page: User is redirected to home page after clicked on “change location” link.

At Results Page: Assert that “STARBUCKS® Limerick - Thomas Street” is displayed.

## Steps:

* Install Java

* Install Eclipse

* Create a Maven project

* Add dependencies (pom.xml -- cucumber java, cucumber jnunit, selenium java, junit)

* Install plugin (marketplace -- cucumber, gherkin)

* Install Selenium IDE on browser (not used in the project, but can be helpful)

* Download drivers (Version 96.0.4664.110 (64-bit)): Google Chrome https://chromedriver.storage.googleapis.com/index.html?path=96.0.4664.45/

* Download drivers: Selenium WebDriver

* Create a new folder in src/test/resources -- Features

* Create a new folder in src/test/java -- StepDefinition

* Create a new file in Features w/ the scenarios and steps usin Gherkin and run it with Cucumber -- .feature

* Run .feature file to get the blueprint to insert the backend/glue code

* Create the backend code/class (gluecode) in the StepDefinition

* Fullfill the steps with Java code and Gherkins on StepDefinition -- complete the blancs and run it with cucumber

* Create a testRunner class and config it (features, glue, reports, tags)

* Run the tags to get reports -- reports available in html, json and XML

*** Extra: Login test with parameterization -- src/test/java/pages/LoginPage.java | stepDefinition/Login.java | src/test/resources/Features/login.feature 

## Folders:

Features  -- .feature -- right click and Run As Cucumber Feature individually

stepDefinition -- files .java with backend code 

pages -- .java reusable code

target -- Html, Json and JUnit (.xml) reports

drivers -- Google Chrome and Selenium Java

**pom.xml -- file with the dependencies

## JUnit report:

TestRunner.java -- run As JUnit Test with tags="@Test1" to generate JUnit .xml reports for @Test1 (change it for @Test2, @Test3 and @Test4 for respectives reports) 




