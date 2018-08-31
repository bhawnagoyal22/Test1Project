package extentpackageListener;

import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;


public class capturescreenshot {
	
	public void cscreenshot(WebElement driver,String screenshotname) {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcfile=  ts.getScreenshotAs(OutputType.FILE);
		String desfile="temp.png";
		File dest=new File(desfile);
		//Files.copy(source, out)
				
		
	}

}
