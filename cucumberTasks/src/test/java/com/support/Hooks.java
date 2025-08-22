package com.support;

public class Hooks {
private final DriverManager dm;

public Hooks(DriverManager dm) {
	this.dm = dm;
}

public void beforeScenario() {
//	You could add logging, clean cookie
}

public void afterScenario() {
	if(dm != null && dm.driver != null) {
		dm.driver.quit();
	}
}
}
