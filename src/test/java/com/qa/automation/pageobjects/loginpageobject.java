package com.qa.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;

public class loginpageobject {
	private WebDriver driver;
	private WebDriverWait wait;
	Scenario scn;
	public loginpageobject(WebDriver driver) 
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, 15);
	}
	private By email_id =By.xpath("//input[@name='identifier']");
	private By Next_btn =By.xpath("//span[@text()='Next']");
	private By Password = By.xpath("//input[@type='password']");
	private By gmail_logo = By.xpath("");
	
	public void Email(String emailid)
	{
		WebElement emailfiendEle= driver.findElement(email_id);
		emailfiendEle.sendKeys(emailid);
	}
	public void next_btn()
	{
		WebElement nextBtnEle = driver.findElement(Next_btn);
		nextBtnEle.click();
		
	}
	public void password(String Pass)
	{
		WebElement passwordEle = driver.findElement(Password);
		passwordEle.sendKeys(Pass);
	}
	

}
