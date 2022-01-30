package AnnotationHelperAttributes;

import org.testng.annotations.Test;

public class ToSkipTestcase {
	@Test(timeOut=4000)
	public void first()
	{
		System.out.println("First testcase");
	}
	@Test(enabled=false)
	public void second()
	{
		System.out.println("Second testcase");
	}

}
