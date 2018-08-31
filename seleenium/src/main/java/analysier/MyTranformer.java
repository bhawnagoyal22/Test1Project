package analysier;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class MyTranformer implements IAnnotationTransformer  {

	public void transform(ITestAnnotation annotation,Class testclass,Constructor testConstructor,Method testMethod)
	
	{
		annotation.setRetryAnalyzer(retryAnalyiser.class);
		
	}
	
}
