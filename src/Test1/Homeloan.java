package Test1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Homeloan {
	@BeforeSuite
	public void BeforeSt()
	{
		System.out.println("Iam no1");
	}
	@AfterMethod
	public void Aftereverymethod()
	{
		System.out.println("After every method");
	}
	
	@Test(groups={"smoke"})
	public void Webloginhomeloan ()
	{
		System.out.println("Webloginhomeloan");
	}
	@Test
	public void Mobileloginhomeloan ()
	{
		System.out.println("Mobileloginhomeloan");
	}
	@Test
	public void APIloginhomeloan ()
	{
		System.out.println("APIloginhomeloan");
	}
	@AfterClass
	public void Afterclass()
	{
		System.out.println("Execute after all the methods in the class");
	}

}
