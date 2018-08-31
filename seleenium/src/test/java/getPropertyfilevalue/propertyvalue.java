package getPropertyfilevalue;
//import seleenium.src.main.java.analysier;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import analysier.readPropertyFile;

public class propertyvalue extends readPropertyFile {

	
	propertyvalue() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void login() 
	{
		
		System.out.println(prop.getProperty("url"));
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void againlogin() 
	{ 
		Assert.assertEquals(true, true);
	}
	
}
