//package stepDefinition;
//
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import io.cucumber.java.en.*;
//import pages.LoginPage;
//import pages.OpenHome;
//
//public class Login {
//
//	WebDriver driver = null;
//	LoginPage login;
//
//	@Given("Just Eat home page is open")
//	public void just_eat_home_page_is_open() {
//		System.out.println("Inside Step: Just Eat home page is open");
//
//		OpenHome OpenHome = new OpenHome();
//		driver = OpenHome.openResultJustEat();
//
//	}
//
//	@And("user is in the login page")
//	public void user_is_in_the_login_page() {
//		System.out.println("Inside Step: user is in the login page");
//
//		driver.navigate().to("https://www.just-eat.ie/account/login?returnurl=%2F");
//	}
//
//	@When("^user enters wrong (.*) and (.*)$")
//	public void user_enters_wrong_username_and_password(String username, String password) {
//		System.out.println("Inside Step: user enters wrong username and password");
//
//		// Bringing from LoginPage
//		login = new LoginPage(driver);
//		login.enterUsername(username);
//		login.enterPassword(password);
//
//	}
//
//	@And("clicks on login")
//	public void clicks_on_login() {
//		System.out.println("Inside Step: clicks on login");
//
//		login.clickLogin();
//
//	}
//
//	@Then("system shall display Please enter a valid email address")
//	public void system_shall_display_please_enter_a_valid_email_address() {
//		System.out.println("Inside Step: system shall display Please enter a valid email address");
//
//		login.checkLogOutIsDisplayed();
//		driver.close();
//		driver.quit();
//
//	}
//
//}
