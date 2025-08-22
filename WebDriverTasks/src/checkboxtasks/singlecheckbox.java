package checkboxtasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class singlecheckbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		try {
		driver.get("https://proleed.academy/exercises/selenium/automation-practice-form-with-radio-button-check-boxes-and-drop-down.php?utm_source=chatgpt.com");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement checkbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("studentid")));
		
		if(!checkbox.isSelected()) {
			checkbox.click();
		}
		if(checkbox.isSelected()) {
			System.out.println("Checkbox is selected - sucess");
		}else {
			System.out.println("Checkbox is failed to select");
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
