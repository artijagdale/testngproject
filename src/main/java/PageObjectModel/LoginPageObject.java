package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
    
	public WebDriver driver;
	
	 private By username = By.xpath("//input[@id='username']");
	 private By password = By.xpath("//input[@id='password']");
	 private By login = By.xpath("//input[@id='Login']");
	 private By TryForFree = By.xpath("//a[@id='signup_link']");
	 private By Errormessage = By.xpath("//div[@id='error']");
	 private By ForgotYourPassword=By.xpath("//a[@id='forgot_password_link']");
	 
	public LoginPageObject(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement enterUsername() {
		
	return driver.findElement(username);	
	}
	
	public WebElement enterPassword() {
		
	return driver.findElement(password);	
	}
	
	public WebElement ClickonLogin() {
		
	return driver.findElement(login);	
	}
	
	public WebElement ClickonTryForFree() {
		
	return driver.findElement(TryForFree);	
	}
	
	public WebElement Errormessage() {
	return driver.findElement(Errormessage);	
	}
	
	public WebElement ForgotYourPassword() {
	return driver.findElement(ForgotYourPassword);	
	}
}
