package basicTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.loginfacebookTest;

public class pomloginfacebooktest {

	WebDriver driver ;
	
	@Test
	public void LoginFacebook() {
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		 loginfacebookTest Test1 = new loginfacebookTest(driver);
		 Test1.getLogin("bhawna");
		 Test1.getPassword("goyal");
	}
	
	
	
	
}
