package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.OpenHome;

public class ChangeLocation {

	WebDriver driver = null;

	@Given("Just Eat result page is open")
	public void just_eat_result_page_is_open() {
		System.out.println("Inside Step: Just Eat result page is open");

		OpenHome OpenHome = new OpenHome();
		driver = OpenHome.openResultJustEat();
	}

	@When("selecting change location button")
	public void selecting_change_location_button() {

		driver.findElement(By.linkText("change location")).click();
	}

	@Then("page is closed")
	public void page_is_closed() {
		driver.close();
		driver.quit();
	}
}
