package com.project.pom;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class FormTest {
	
	
	private WebDriver driver;
	CompleteForm formPage;
	
	@Before
	public void setup() throws Exception {
		formPage = new CompleteForm (driver);
		driver = formPage.chromeDriverConecction();
		driver.manage().window().maximize();
		
		
	}

	@Test
	public void test_FP() {
		formPage.visit("http://automationpractice.com/index.php");
		formPage.selectSubject();
		formPage.completeForm();
		
	}

}
