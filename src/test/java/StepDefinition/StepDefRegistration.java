package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class StepDefRegistration {
		public WebDriver driver;
	
	
	@When("User open the URL {string}")
	public void user_open_the_url(String URL) {
	    driver.get(URL);
	}

	@When("User click on Forms link")
	public void user_click_on_forms_link() {
	    
	}

	@When("User Click on Practice Form link")
	public void user_click_on_practice_form_link() {
	    
	}

	@Then("User view Registration page")
	public void user_view_registration_page(String expectedTitle) {
	    String actualTitle=driver.getTitle();
	    
	    if(actualTitle.equals(expectedTitle))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
		{
			Assert.assertTrue(false);
		}
	    
	}
	/////Registration page
	@When("User enter Personal Details")
	public void user_enter_personal_details() {
	    
	}

	@When("click on Submit button")
	public void click_on_submit_button() {
	   
	}

	@Then("User can view Thank You message")
	public void user_can_view_thank_you_message() {
	    
	}
}
