package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {
     
	public WebDriver driver;
	
	By FirstName=By.xpath("//input[@name='UserFirstName']");
	By LastName=By.xpath("//input[@name='UserLastName']");
	By WorkEmail=By.xpath("//input[@name='UserEmail']");
	By SelectJobTitle=By.xpath("//select[@name='UserTitle']");
	By CompanyName=By.xpath("//input[@name='CompanyName']");
	By SelectEmployees=By.xpath("//select[@name='CompanyEmployees']");
	By Phone=By.xpath("//input[@name='UserPhone']");
	By SelectCountry=By.xpath("//select[@name='CompanyCountry']");
	By SelectCheckboxno1=By.xpath("(//div[@class='checkbox-ui'])[1]");
	By SelectCheckboxno2=By.xpath("(//div[@class='checkbox-ui'])[2]");
	
	public SignUpPageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement enterFirstName() {
	return driver.findElement(FirstName);	
		}
	public WebElement enterLastName() {
	return driver.findElement(LastName);	
	}
	public WebElement enterWorkEmail() {
	return driver.findElement(WorkEmail);
	}
	public WebElement enterCompanyName() {
	return driver.findElement(CompanyName);	
	}
	public WebElement enterphoneNo() {
	return driver.findElement(Phone);	
	}
	public WebElement selectJobTitle() {
	return driver.findElement(SelectJobTitle);	
	}
	public WebElement selectEmployees() {
    return driver.findElement(SelectEmployees);	
    }
	public WebElement selectCountry() {
	return driver.findElement(SelectCountry);	
	}
	public WebElement selectcheckboxno1() {
	return driver.findElement(SelectCheckboxno1);	
	}
	public WebElement selectcheckboxno2() {
	return driver.findElement(SelectCheckboxno2);	
	}
	
	
}
