package Test1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class carloan {
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("Execute before any method in teh class");
	}
	@Test
	public void WebLoginCarloan()
	{
		System.out.println("Weblogincarloan");
		System.out.println("Weblogincarloan")
		System.out.println("Weblogincarloan")
		System.out.println("Weblogincarloan")
		System.out.println("Weblogincarloan")
	}
	@Test
	public void MobileLoginCarloan()
	{
		System.out.println("Mobilelogincarloan");
	}
	@Test(groups={"smoke"})
	public void MobileSignon()
	{
		System.out.println("Mobilelogincarloan");
	}
	
	@Test
	public void MobileSignoff()
	{
		System.out.println("Mobilelogincarloan");
		
	}
	@Test(dataProvider="getData")
	public void APILoginCarloan(String username,String password)
	{
		System.out.println("APIlogincarloan");
		System.out.println(username);
		System.out.println(password);
	}
	//To send more than 1 paramters to a method to execute
		//Use dataprovider annotation
	@DataProvider
	public Object[][] getData()
	{
		//Define a multidimention array
		//First value shows how manytimes we have to execute this dataprovider
		//Second value shows how  many parameters we are sending in each execution
		Object[][] set=new Object[3][2];
		set[0][0]="Firstname";
		set[0][1]="Passwrd1";
		
		set[1][0]="Secondname";
		set[1][1]="Passwrd2";
		
		set[2][0]="Thirdname";
		set[2][1]="Passwrd3";
		
		return set;
		
	}
	

}
