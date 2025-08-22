package extentreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentTask {
	ExtentReports extent;
	ExtentTest test; 
	WebDriver driver;
	
	@BeforeTest
	public void startReport() {
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("report.html");
		extent.attachReporter(spark);
		driver = new ChromeDriver();
	}
	@Test
	public void demoReport() {
		test = extent.createTest("Google Test");
		driver.get("https://google.com");
		test.pass("Opened Google");
	}
	
	@AfterTest
	public void endReport() {
		driver.quit();
		extent.flush();
	}
}
