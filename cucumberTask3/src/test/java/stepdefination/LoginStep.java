package stepdefination;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStep {

	WebDriver driver;
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.get("http://localhost/SuiteCRM-7.14.7/index.php?action=Login&module=Users&login_module=Home&login_action=index");
		
	}
	
	@When("User enters username {string} and password {string}")
	public void user_enters_username_and_password(String username,String password) {
	WebElement user =	driver.findElement(By.id("user_name"));
	WebElement pass = driver.findElement(By.id("username_password"));
	WebElement login = driver.findElement(By.id("bigbutton"));
	
	user.clear();
	pass.clear();
	
	user.sendKeys(username);
	pass.sendKeys(password);
	
	login.click();
	}
	
	@Then("Login should be {string}")
	public void login_should_be(String status) {
		if(status.equalsIgnoreCase("success")) {
			assertTrue(driver.getTitle().contains("Home"));
		}else {
			assertTrue(driver.getPageSource().contains("Invalid Username and Password"));
		}
		driver.quit();
	}
}
