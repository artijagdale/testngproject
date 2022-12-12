package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import Resources.CommonMethods;
import Resources.baseClass;
import Resources.constant;

public class LoginTestCase extends baseClass{
   
	@Test
	public void login() throws IOException {
		
	 LoginPageObject LPO = new LoginPageObject(driver);
	 
	 LPO.enterUsername().sendKeys(constant.username);
	 LPO.enterPassword().sendKeys(constant.password);
	 LPO.ClickonLogin().click();
	
	 CommonMethods.handleAssertion(LPO.Errormessage().getText(),constant.errormessage);
	 CommonMethods.handleAssertion(LPO.ForgotYourPassword().getText(),constant.ForgotYpurPassword);
	
	}
}
