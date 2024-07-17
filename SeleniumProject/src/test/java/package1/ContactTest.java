package package1;

import org.testng.annotations.Test;

public class ContactTest 
{
	@Test
	public void createContactTest()
	{
		String URL = System.getProperty("URL");
		String BROWSER = System.getProperty("BROWSER");
		String UN = System.getProperty("UN");
		String PWD = System.getProperty("PWD");
		
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(BROWSER);
		System.out.println(PWD);
		System.out.println("execute createContactTest");
	}
	
	@Test(groups = "smokeTest")
	public void modifyContactTest()
	{
		System.out.println("execute modifyContactTest");
	}
}
