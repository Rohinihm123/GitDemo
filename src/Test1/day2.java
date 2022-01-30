package Test1;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class day2 {
	
	@AfterTest
	public void Demo4()
	{
		System.out.println("I will execute last");
	}
	@Test public void Demo()
	{
		System.out.println("hello");
	}
	@Parameters ({"URLname"})
	@Test
	public void Demo2(String URL)
	{
		System.out.println("bye");
		System.out.println(URL);
		Assert.assertTrue(false);
	}
}

