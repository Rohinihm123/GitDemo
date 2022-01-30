package Test1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	@AfterSuite
	public void AfterSt()
	{
		System.out.println("Iam the last");
	}
	@BeforeMethod
	public void Beforeeverymethod()
	{
		System.out.println("Before every methods");
	}
	@Test(groups={"smoke"})
	public void Demo()
	{
		System.out.println("hello");
	}
	@Parameters({"URL"})
	@Test
	public void Demo5(String urlname)
	{
		System.out.println("hello");
		System.out.println(urlname);
	}
	@BeforeTest
	public void Demo3()
	{
		System.out.println("I will execute first");
	}
}
