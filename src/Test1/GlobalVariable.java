package Test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalVariable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Properties is a class which has methods to read data from external proeprty file
		Properties prop=new Properties();
		//To tell prop where is the peroperty file locaton
		//Crete a object for filepath
		FileInputStream fis=new FileInputStream("D:\\workspace\\SeleniumLearning\\TestNG\\src\\Test1\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser","firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos=new FileOutputStream("D:\\workspace\\SeleniumLearning\\TestNG\\src\\Test1\\data.properties");
		prop.store(fos,null);
		

	}

}
