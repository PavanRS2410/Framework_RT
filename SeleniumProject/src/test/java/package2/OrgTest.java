package package2;

import org.testng.annotations.Test;

public class OrgTest 
{
	@Test(groups = "smokeTest")
	public void createOrgTest()
	{
		String URL = System.getProperty("URL");
		String BROWSER = System.getProperty("BROWSER");
		String UN = System.getProperty("UN");
		String PWD = System.getProperty("PWD");
		
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(BROWSER);
		System.out.println(PWD);
		System.out.println("execute createOrgTest");
	}
	
	@Test
	public void modifyOrgTest()
	{
		System.out.println("execute modifyOrgTest");
	}
}
