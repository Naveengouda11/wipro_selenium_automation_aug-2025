package checkboxtasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class multiplecheckbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		try {
		driver.manage().window().maximize();
		driver.get("https://proleed.academy/exercises/selenium/automation-practice-form-with-radio-button-check-boxes-and-drop-down.php");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
		
		WebElement Studentid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("studentid")));
		WebElement passport = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passport")));
		WebElement voter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("votercard")));
		
//		Scroll to view
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Studentid);
	Thread.sleep(300);
		
		if(!Studentid.isSelected()) {
			Studentid.click();
		}
		
		if(!passport.isSelected()) {
			passport.click();
		}
		if(!voter.isSelected()) {
			voter.click();
		}
		
		if(Studentid.isSelected() && passport.isSelected() && voter.isSelected()) {
			System.out.println("All Checkboxes are selected");
		}else {
			System.out.println("Some check boxes are not selected");
		}
		
		}catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
