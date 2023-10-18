package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert; 
public class StepDef {
	
	public WebDriver driver; 
	public LoginPage loginpage;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	   driver = new ChromeDriver();
	   loginpage= new LoginPage();
	}

	@When("User open URL {string}")
	public void user_open_url(String URL) {
	    driver.get(URL);
	}

	@When("User enter Username as {string} as and password as {string}")
	public void user_enter_username_as_as_and_password_as(String Username, String Password) {
		loginpage.enterEmail(Username);
		loginpage.enterPassword(Password);
	}

	@When("Click on Login")
	public void click_on_login() {
		loginpage.clickonLoginButton();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedTitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	@When("User Click on Logout link")
	public void user_click_on_logout_link() {
		
			loginpage.clickonLogoutButton();
		
	}

	@Then("close browser")
	public void close_browser() {
	    driver.quit();
	}
}
