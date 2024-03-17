package com.qa.automation.pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;

public class composeFunctionalityobject {
	private WebDriver driver;
	private WebDriverWait wait;
	Scenario scn;
	
	public composeFunctionalityobject(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 15);
	}
	
	private By compose_Btn = By.xpath("//div[@class='T-I T-I-KE L3']");
	private By new_msg =By.xpath("//div[@class='aYF']");
	private By to_field =By.xpath("//input[@class='agP aFw']");
	private By sub_field =By.xpath("//input[@name='subjectbox']");
	private By msg_field =By.xpath("//div[@class='Am aiL Al editable LW-avf tS-tW']");
	private By send_btn = By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']");
	private By successMsg = By.xpath("//div[@class='vh']");
	
	public void compose()
	{
		WebElement composeBtnEle = driver.findElement(compose_Btn);
		composeBtnEle.click();
	}
	public void newMsgField(String actMsg)
	{
		WebElement chk_msg = driver.findElement(new_msg);
		Assert.assertEquals(true, chk_msg.getText().contains(actMsg));
	}
	public void toField(String mailid)
	{
		WebElement composeBtnEle = driver.findElement(to_field);
		composeBtnEle.sendKeys(mailid);	
	}
	public void subjectField(String sub)
	{
		WebElement subFieldEle = driver.findElement(sub_field);
		subFieldEle.sendKeys(sub);	
	}
	public void messageField(String msg)
	{
		WebElement msgFieldEle = driver.findElement(msg_field);
		msgFieldEle.sendKeys(msg);	
	}
	public void send()
	{
		WebElement sendBtnEle = driver.findElement(send_btn);
		sendBtnEle.click();
	}
	public void successMsg()
	{
		WebElement successmsgEle = driver.findElement(successMsg);
		Assert.assertEquals(successMsg, successmsgEle.getText());
		wait.until(ExpectedConditions.visibilityOf(successmsgEle));
				
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
