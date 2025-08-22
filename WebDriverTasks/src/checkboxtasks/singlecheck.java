package checkboxtasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class singlecheck {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://proleed.academy/exercises/selenium/automation-practice-form-with-radio-button-check-boxes-and-drop-down.php");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Wait until the element is *visible* (not just present)
            WebElement checkbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("studentid")));

            // Scroll the element into view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox);

            // Give a small delay to allow scroll animation (optional but safe)
            Thread.sleep(500);

            // JavaScript click to avoid intercept issues
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkbox);

            // Validate selection
            if (checkbox.isSelected()) {
                System.out.println("Checkbox is selected - success");
            } else {
                System.out.println("Checkbox failed to select");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            driver.quit();
        }
    }
}
