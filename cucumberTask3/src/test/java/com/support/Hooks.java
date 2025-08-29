package com.support;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	private final DriverManager dm;
	
	public Hooks(DriverManager dm) {
		this.dm = dm;
	}
	
	@Before
	public void beforeSenario() {
		
	}
	
	@After
	public void afterSenario() {
		if(dm != null && dm.driver != null) {
			dm.driver.quit();
		}
	}

}
