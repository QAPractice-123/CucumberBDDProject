Feature: login 

Scenario: Successful login with valid credentials without Data Driven Testing
	Given User Launch Chrome browser
	When User open URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"  
	And User enter Username as "Admin" as and password as "admin123"
	And Click on Login
	Then Page Title should be "OrangeHRM"
	When User Click on Logout link
	Then Page Title should be "OrangeHRM"
	And close browser
	
#Scenario Outline: Successful login with valid credentials Data Driven Testing
#	Given User Launch Chrome browser
#	When User open URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"  
#	And User enter Username as "<Username>" as and password as "<password>"
#	And Click on Login
#	Then Page Title should be "OrangeHRM"
#	When User Click on Logout link
#	Then Page Title should be "OrangeHRM"
#	And close browser
	
#Examples:
|Username|password|
|Admin|admin123| 
|Test|admin123|