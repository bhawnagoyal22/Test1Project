package retrylogicTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class myretrylogicTest {

	@Test
	public void login() 
	{
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void againlogin() 
	{ 
		Assert.assertEquals(true, true);
	}
	
}
