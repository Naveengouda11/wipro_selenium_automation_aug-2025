package stepdefination;

//import static org.junit.Assert.assertTrue;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoogleSteps {
WebDriver driver;
	
	@Given("User is on Google Home Page")
	public void user_is_on_google_home_page() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@When("User searches for {string}")
	public void user_searches_for(String query) {
		driver.findElement(By.name("q")).sendKeys(query);
		driver.findElement(By.name("q")).submit();
	}
	
	@Then("Results should contain {string}")
	public void results_should_contain(String keyword) {
		assertTrue(driver.getPageSource().toLowerCase().contains(keyword.toLowerCase()));
		driver.quit();
	}
	
}
