@ui @amruta_automation_assignment
Feature: E-commerce Project Web Site Health Check

Background: Navigate to the base URL of application and verify the Page
Given user navigate to the home application url "http://www.gmail.com"

@loginValidation
Scenario: Validate Login Functionality
Given User enter Email id  "abc@gmail.com"
And User click on Next button
And User enter Password "abc@01"
And User click on PassNext button
Then User verify gmail page

@ComposeFuctionalityValidation
Scenario: Validate Compose Fuctionality 
Given User Click on Composee Button
And Verify The Mail window is opened by text "New Message"
And User enter email id "xyz@gmail.com" in To section
And user Enter subject "hello" in Subject Section
And User enter message in compose section "Hello my name is ABC"
Then User click on Send button
And User validate the confirmation message
