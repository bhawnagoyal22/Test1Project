package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginfacebookTest {

	WebDriver driver;
	
	By lname= By.id("email");
	By lpwd = By.id("pass");
	
	public loginfacebookTest(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void getLogin(String username) {
		driver.findElement(lname).sendKeys(username);
		
	}
	
	public void getPassword(String passwrod) {
		driver.findElement(lpwd).sendKeys(passwrod);
		
	}
	
}
