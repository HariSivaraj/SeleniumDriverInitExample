package com.globalsqa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.globalsqa.base.BaseTest;
import com.globalsqa.driver.DriverManager;

public class LoginWeb extends BaseTest {

	@Test
	public void openUi() {
		DriverManager.getDriver().get("https://www.globalsqa.com/");
		String title = DriverManager.getDriver().getTitle();
		System.out.println("title of home page" + title);
		Assert.assertTrue(title.toString().contains("GlobalSQA"));
	}
	
}
