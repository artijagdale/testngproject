package Testcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.SignUpPageObject;
import Resources.CommonMethods;
import Resources.baseClass;
import Resources.constant;

public class SignUpTestCase extends baseClass {

	@Test
	public void VerifySignUp() throws IOException, InterruptedException {
		
	 LoginPageObject LPO = new LoginPageObject(driver);
	 
	 LPO.ClickonTryForFree().click();
	 Thread.sleep(4000);
	 
	 SignUpPageObject SPO = new SignUpPageObject(driver);
	 
	 Thread.sleep(4000);
	 SPO.enterFirstName().sendKeys(constant.FirstName);
	 SPO.enterLastName().sendKeys(constant.LastName);
	 SPO.enterWorkEmail().sendKeys(constant.WorkEmail);
	 SPO.enterCompanyName().sendKeys(constant.CompanyName);
	 SPO.enterphoneNo().sendKeys(constant.PhoneNo);
	 SPO.selectcheckboxno1().click();

	 
	
	 CommonMethods.selectDropdown(SPO.selectJobTitle(),1);
	 CommonMethods.selectDropdown(SPO.selectEmployees(),1);
	 CommonMethods.selectDropdown(SPO.selectCountry(),1);
	 
	}
	
}
