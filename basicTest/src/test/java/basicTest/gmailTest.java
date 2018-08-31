package basicTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class gmailTest {	
		public WebDriver driver=new FirefoxDriver();
		String url="https://www.facebook.com/";
	
		@Test
		@Parameters({"fname","lname"})
		public void login(String fname, String lname) {
			System.out.println("login successfull 55y");
			
			driver.manage().window().maximize();
			driver.get(url);
			driver.findElement(By.name("firstname")).sendKeys(fname);
			driver.findElement(By.name("lastname")).sendKeys(lname);
			driver.findElement(By.name("reg_email__")).sendKeys("temp@gmail.com");
			Select day=new Select(driver.findElement(By.id("day")));
			day.selectByVisibleText("3");
			driver.close();
		
		}


		
}
