package stepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;
import pages.OpenHome;

public class StarbucksDisplayed {

	WebDriver driver = null;

	@Given("user is on Just Eat home page")
	public void user_is_on_Just_Eat_home_page() {
		System.out.println("Inside Step: User is on Just Eat home page");

		OpenHome OpenHome = new OpenHome();
		driver = OpenHome.openJustEat();

	}

	@When("it goes to Just Eat result page")
	public void it_goes_to_just_eat_result_page() {
		
		driver.navigate().to("https://www.just-eat.ie/area/shannon_limerick-limerick?lat=52.6638367&long=-8.6267343");

	}

	@Then("system shall display STARBUCKS Limerick - Thomas Street")
	public void system_shall_display_starbucks_limerick_thomas_street() {

		boolean check = driver.getPageSource().contains("STARBUCKS® Limerick - Thomas Street");
		
		if (check) {
			System.out.println("________________________________________________");
			System.out.println("STARBUCKS® Limerick - Thomas Street IS DISPLAYED");
			System.out.println("________________________________________________");

		} else {
			System.out.println("____________________________________________________");
			System.out.println("STARBUCKS® Limerick - Thomas Street IS NOT DISPLAYED");
			System.out.println("____________________________________________________");
		}
		
		driver.close();
		driver.quit();
	}

}
