package analysier;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnalyiser implements IRetryAnalyzer {
	
	int count=0;
	int retryLimit=3;
	
	public boolean retry(ITestResult res) {
		if (count < retryLimit) {
			count ++;
			return true;
		}
		
		return false;
	}

}
