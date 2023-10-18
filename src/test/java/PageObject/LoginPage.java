package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement Username;

	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement Password;
	
	@FindBy(css="button[type='submit']")
	WebElement loginbutton;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	WebElement dropdownbutton;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement logoutbutton;
	
	
	public void enterEmail(String emailAdd)  {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Username.sendKeys(emailAdd);
	}
	public void enterPassword(String Pwd) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Password.sendKeys(Pwd);
	}
	public void clickonLoginButton() {
		loginbutton.click();
	}
	public void clickonLogoutButton()  {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dropdownbutton.click();
		logoutbutton.click();
	}
}
