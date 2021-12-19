//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class LoginPage {
//
//	protected WebDriver driver;
//
//	private By txt_username = By.id("Email");
//	private By txt_password = By.id("Password");
//	private By btn_login = By.id("login");
//	private By btn_logout = By.id("logout");
//	
//	//Constructor - called every time we create a instance of the object
//	public LoginPage(WebDriver driver) {
//		
//		this.driver = driver; //Making sure the driver above is same as WebDriver driver
//		
//	}
//
//	public void enterUsername(String username) {
//
//		driver.findElement(txt_username).sendKeys(username);
//	}
//
//	public void enterPassword(String password) {
//
//		driver.findElement(txt_password).sendKeys(password);
//	}
//
//	public void clickLogin() {
//
//		driver.findElement(btn_login).click();
//	}
//	
//	public void checkLogOutIsDisplayed() {
//		
//		driver.findElement(btn_logout).isDisplayed();
//		
//	}
//	
//	public void loginValidUser(String username, String password) {
//		
//		driver.findElement(txt_username).sendKeys(username);
//		driver.findElement(txt_password).sendKeys(password);
//		driver.findElement(btn_login).click();
//		
//	}
//}
