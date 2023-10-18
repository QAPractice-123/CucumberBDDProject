Feature: Registration Form

Scenario: Succesfully Add new Customer
Given User Launch Chrome browser
When User open the URL "https://demoqa.com/"
And User click on Forms link
And User Click on Practice Form link
Then User view Registration page 
When User enter Personal Details
And click on Submit button
Then User can view Thank You message
And close browser

