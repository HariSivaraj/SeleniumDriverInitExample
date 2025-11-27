package com.globalsqa.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.globalsqa.driver.DriverInit;
import com.globalsqa.driver.DriverManager;

public class BaseTest {

	@BeforeMethod
	public void setup() {
		DriverInit.initDriver();
	}

	@AfterMethod
	public void tearDown() {
		DriverManager.unload();
	}
}
