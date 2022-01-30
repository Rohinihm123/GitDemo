package AnnotationHelperAttributes;

import org.testng.annotations.Test;

public class DependonMethod {
	//Usually methods executed on alphabetical order
		//But if we want some method to be prioritized first then use dependOnMethods tag
	
	@Test
	public void Login()
	{
		System.out.println("This is my login");
	}
	@Test(dependsOnMethods={"Login","MyTransactionScreen"})
	public void HomePage()
	{
		System.out.println("This is my homepage");
	}
	@Test
	public void MyTransactionScreen()
	{
		System.out.println("This is my transaction screen");
	}
	@Test
	public void MyTransactionScreen1()
	{
		System.out.println("This is my transaction screen1");
		System.out.println("This is my transaction screen1");
		System.out.println("This is my transaction screen1");
		System.out.println("This is my transaction screen1");
		System.out.println("This is my transaction screen1");
	}

}
