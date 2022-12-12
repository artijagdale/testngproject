package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class baseClass {
         
	public WebDriver driver;
	
	public void browserInitialization() throws IOException {
		
	FileInputStream fis = new FileInputStream("C:\\Users\\Arti Jagdale\\eclipse-workspace\\Selenium19thSept22TestNGproject\\src\\main\\java\\Resources\\data.properties");
	
	Properties prop = new Properties();
	
	prop.load(fis);
	
	String browserName = prop.getProperty("browser");
	
	if(browserName.equalsIgnoreCase("Chrome")) {
		
       driver = new ChromeDriver();
		
	}
		
	else if(browserName.equalsIgnoreCase("Firefox")) {
		
	    //firefox code
	
	}
	else{
		
	System.out.println("please enter valid browser name");	
	
	}
	}
	
	@BeforeMethod
	public void launch() throws IOException {
		
	browserInitialization();
	driver.get("https://login.salesforce.com/?locale=in");
			
	}
	
	
	
	
	
	
	
	
	
}
