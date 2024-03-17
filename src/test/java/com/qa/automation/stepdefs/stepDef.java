package com.qa.automation.stepdefs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.qa.automation.core.webdriverFactory;
import com.qa.automation.pageobjects.composeFunctionalityobject;
import com.qa.automation.pageobjects.loginpageobject;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class stepDef {
	
	private static final Logger logger = LogManager.getLogger(stepDef.class);
	private WebDriver driver;
	private WebDriverWait wait;
	Scenario scn;
	loginpageobject loginpageObject;
	composeFunctionalityobject composeFuctionalityObject;
	
	@Before
	public void setUp(Scenario scn) throws Exception {
		this.scn = scn;
		String browserName = webdriverFactory.getBrowserName();
		driver = webdriverFactory.setWebDriverForBrowser(browserName);
		loginpageObject = new loginpageobject(driver);
	    composeFuctionalityObject = new composeFunctionalityobject(driver);
	}
		
	

	//Login Functionality
		@Given("user navigate to the home application url {string}")
		public void user_navigate_to_the_home_application_url(String url) {
			
			webdriverFactory.navigateToTheUrl(url);
		    
		}

		@Given("User enter Email id  {string}")
		public void user_enter_email_id(String eid) {
			loginpageObject.Email(eid);
		   
		}
		@Given("User click on Next button")
		public void user_click_on_next_button() {
			loginpageObject.next_btn();
		    
		}
		@Given("User enter Password {string}")
		public void user_enter_password(String pass) {
			loginpageObject.password(pass);
		    
		}
		@Given("User click on PassNext button")
		public void user_click_on_pass_next_button() {
			loginpageObject.next_btn();
		}
		@Then("User verify gmail page")
		public void user_verify_gmail_page() {
			String actualurl ="url";
		   String expectedUrl=driver.getCurrentUrl();
		   Assert.assertEquals(expectedUrl, actualurl);
		}
		
		
		//Compose Functionality
		
		
			@Given("User Click on Composee Button")
			public void user_click_on_composee_button() {
				composeFuctionalityObject.compose();
			}

			@Given("Verify The Mail window is opened by text {string}")
			public void verify_the_mail_window_is_opened_by_text(String msg1) 
			{
				composeFuctionalityObject.newMsgField(msg1);
			   
			}
			@Given("User enter email id {string} in To section")
			public void user_enter_email_id_in_to_section(String mail) 
			{
				composeFuctionalityObject.toField(mail);
			    
			}
			@Given("user Enter subject {string} in Subject Section")
			public void user_enter_subject_in_subject_section(String sb) {
				composeFuctionalityObject.subjectField(sb);
			}
			@Given("User enter message in compose section {string}")
			public void user_enter_message_in_compose_section(String long_msg) {
				composeFuctionalityObject.messageField(long_msg);
			   
			}
			@Then("User click on Send button")
			public void user_click_on_send_button() {
				composeFuctionalityObject.send();
			}
			@Then("User validate the confirmation message")
			public void user_validate_the_confirmation_message() {
				
				composeFuctionalityObject.successMsg();
			    
			}






}
