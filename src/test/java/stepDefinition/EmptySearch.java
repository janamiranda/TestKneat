package stepDefinition;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.*;
import pages.OpenHome;

public class EmptySearch {

	WebDriver driver = null;

	@Given("Just Eat home page is open")
	public void Just_Eat_home_page_is_open() {
		System.out.println("Inside Step: Just Eat home page is open");
		
		OpenHome OpenHome = new OpenHome();
		driver = OpenHome.openJustEat();
	}

	@When("user hits enter with empty search box")
	public void user_hits_enter_with_empty_search_box() {
		System.out.println("Inside Step: user hits enter with empty search box");

		// Inspect the element to find the name of it
		driver.findElement(By.name("postcode")).sendKeys(" ", Keys.ENTER); // Will find the searchbox, fill it empty and hits enter
																			
	}

	@Then("system shaw display Please enter a location")
	public void system_shaw_display_please_enter_a_location() {
		System.out.println("Inside Step: system shaw display Please enter a location");

		WebElement result = driver.findElement(By.id("errorMessage"));
		assertEquals(result.getText(), "Please enter a location");
		driver.close();
		driver.quit();
	}

}
