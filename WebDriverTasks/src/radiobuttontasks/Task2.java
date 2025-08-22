package radiobuttontasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		try {
			
			driver.get("https://proleed.academy/exercises/selenium/automation-practice-form-with-radio-button-check-boxes-and-drop-down.php");
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
			
			WebElement singleR = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("single")));
			WebElement married = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("married")));
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", singleR);			
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", singleR);
			
			Thread.sleep(3000);
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", married);
			Thread.sleep(1000);
			
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", married);
			
			
		
			if(married.isSelected()) {
				System.out.println("Married is selected");
			}else {
				System.out.println("Failed to select");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
