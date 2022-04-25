package com.project.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CompleteForm extends Base {
	

	By contacUs = By.id("contact-link");
	By idContact = By.id("id_contact");
	By email = By.id("email");
	By order = By.id("id_order");
	By attach = By.id("uniform-fileUpload");
	By message = By.id("message");
	By button = By.id("submitMessage");

	
	
	public CompleteForm(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void completeForm() {
	
		
		type("test@test.com",email);
		type("testtesttesttesttest",message);
		type("test",order);
		click(button);
		
	}
	
	public String selectSubject () {
		click(contacUs);
		Select selectList = new Select(findElement(idContact));
		selectList.selectByVisibleText("Customer service");
		return getText(selectList.getFirstSelectedOption());
		
}
	
	
	

}
