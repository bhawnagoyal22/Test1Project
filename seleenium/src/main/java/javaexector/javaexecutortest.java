package javaexector;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javaexecutortest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js =(JavascriptExecutor) driver; 
		
	  js.executeScript("document.getElementById('u_0_2').click();");
	  
	  
	  File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  
	    FileUtils.copyFile(src, new File("C:\\bhawna\\codes\\java.screenshot.png"));
		
	//	js.executeScript("window.scrollBy(0,600)");
		
	//	js.executeScript("alert ('welcome again')");
		//driver.quit();
	}

}
