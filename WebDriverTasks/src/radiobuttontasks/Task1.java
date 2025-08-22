package radiobuttontasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		try {
		driver.get("https://proleed.academy/exercises/selenium/automation-practice-form-with-radio-button-check-boxes-and-drop-down.php");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
		
		WebElement single = wait.until(ExpectedConditions.elementToBeClickable(By.id("single")));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", single);
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", single);
		if(single.isSelected()) {
			System.out.println("Selected option is true");
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
