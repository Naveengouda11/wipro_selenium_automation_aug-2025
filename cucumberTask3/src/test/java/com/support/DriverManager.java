package com.support;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
	public final WebDriver driver;


	public DriverManager() {
		
		ChromeOptions option = new ChromeOptions();
		
		if("true".equalsIgnoreCase(System.getProperty("headless","false"))) {
			option.addArguments("==headless=new");
		}
		
		this.driver = new ChromeDriver(option);
		this.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		this.driver.manage().window().maximize();
	}
	
}
