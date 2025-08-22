package automation3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		 driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		 
		 Alert jsAlert = driver.switchTo().alert();
		 
		 System.out.println("Alert Text : " + jsAlert.getText());
		 
		 jsAlert.accept();
		 
		 Thread.sleep(2000);
		 
		 
		
	}

}
