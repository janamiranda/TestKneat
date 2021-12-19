package stepDefinition;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OpenHome;

public class LimerickSearch {

	WebDriver driver = null;

	@Given("Just Eat home page is open again")
	public void just_eat_home_page_is_open_again() {
		System.out.println("Inside Step: Just Eat home page is open again");

		OpenHome OpenHome = new OpenHome();
		driver = OpenHome.openJustEat();

	}

	@When("user search for Limerick")
	public void user_search_for_limerick() {
		System.out.println("Inside Step: user search for Limerick");

		// Inspect the element to find the name of it
		driver.findElement(By.name("postcode")).sendKeys("Limerick");

		List<WebElement> elements = driver.findElements(By.className("Suggestions_item_PFPmO"));
		System.out.println(elements.size());
		elements.get(0).click();
	}

	@Then("system shall display the header Limerick Strand Hotel")
	public void system_shall_display_the_header_limerick_strand_hotel() {
		System.out.println("Inside Step: system shall display the header Limerick Strand Hotel");

		
		boolean check = driver.getPageSource().contains("Limerick Strand Hotel");
		
		if (check) {
			System.out.println("__________________________________");
			System.out.println("Limerick Strand Hotel IS DISPLAYED");
			System.out.println("__________________________________");

		} else {
			System.out.println("______________________________________");
			System.out.println("Limerick Strand Hotel IS NOT DISPLAYED");
			System.out.println("______________________________________");
		}

		driver.close();
		driver.quit();
	}
}
