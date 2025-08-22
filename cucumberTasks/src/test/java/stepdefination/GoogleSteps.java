package stepdefination;

//import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps {
WebDriver driver;
	
	@Given("User is on Google Home Page")
	public void user_is_on_google_home_page() {
		driver = new ChromeDriver();
		driver.get("https://google.com");
	}
	
	@When("User Searchs for {string}")
	public void user_search_for(String query) {
		driver.findElement(By.name("q")).sendKeys(query);
		driver.findElement(By.name("q")).submit();
	}
	
	@Then("Result should contain {string}")
	public void result_should_contains(String keyword) {
		assertTrue(driver.getPageSource().contains(keyword));
		driver.quit();
	}
	
}
