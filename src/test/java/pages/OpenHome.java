package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenHome {

	WebDriver driver = null;

	public WebDriver openJustEat() {
		System.out.println("Inside Step: Just Eat home page is open");

		String projectPath = System.getProperty("user.dir"); // Will get the location of the project folder
		System.out.println("Project path is:" + projectPath); // Checking where the project is located

		System.setProperty("webdriver.chrome.driver",
				projectPath + "/src/test/resources/drivers/chromedriver/chromedriver.exe"); // Setting ChromeDriver
																							// inside the project and
																							// not local

		// Open Google Chrome
		driver = new ChromeDriver(); // Will open the Chrome Driver
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); // In case your network is slow and you want to
																			// increase wait time

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // Increase page time

		// Open Just Eat page
		driver.navigate().to("https://www.just-eat.ie/"); // Functions from Selenium
		driver.findElement(By.className("CookieBanner_c-cookieBanner-cta_qMQtV")).click();
		
		return driver;

	}

	public WebDriver openResultJustEat() {
		System.out.println("Inside Step: Just Eat home page is open");

		String projectPath = System.getProperty("user.dir"); // Will get the location of the project folder
		System.out.println("Project path is:" + projectPath); // Checking where the project is located

		System.setProperty("webdriver.chrome.driver",
				projectPath + "/src/test/resources/drivers/chromedriver/chromedriver.exe"); // Setting ChromeDriver inside the project and not local

		// Open Google Chrome
		driver = new ChromeDriver(); // Will open the Chrome Driver
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); // In case your network is slow and you want to increase wait time																			
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // Increase page time

		// Open Just Eat page
		driver.get("https://www.just-eat.ie");
		driver.findElement(By.className("CookieBanner_c-cookieBanner-cta_qMQtV")).click();
		driver.navigate().to("https://www.just-eat.ie/area/shannon_limerick-limerick?lat=52.6638367&long=-8.6267343");
		
		return driver;
	}
}
