package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
	WebDriver ldriver;
	
	public Registration(WebDriver rdriver) //constructor
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//div[@class='category-cards']/div[2]")
	WebElement Formlink;
	
	@FindBy(xpath ="//div[@class='element-list collapse show']//li[@id='item-0']")
	WebElement Practicelink;
	
	@FindBy(id="firstName")
	WebElement firstname;
	
	@FindBy(id="lastName")
	WebElement lastName;
	
	@FindBy(id="userEmail")
	WebElement Email;
	
	@FindBy(xpath="//input[@value=\"Male\"]")
	WebElement MaleRadiobutton;
	
	@FindBy(xpath ="//input[@id=\"userNumber\"]")
	WebElement MobileNumber;
	
	@FindBy(id="dateOfBirthInput")
	WebElement DOB;
	@FindBy(xpath="//div[contains(@class, 'ubjects-auto-complete__value-container')]")
	WebElement Subjects;
	
	@FindBy(id="hobbies-checkbox-1")
	WebElement SportsCheckbox;
	
	@FindBy(id="uploadPicture")
	WebElement ChooseFileButton;
	
	@FindBy(id="currentAddress")
	WebElement CurrentAddressTextBox;
	
	@FindBy(xpath="//div[@id='state']")
	WebElement StateDropdown;
	

	
	
	

}
